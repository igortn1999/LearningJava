package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando{
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA, INVERTE
	};
	
	private static final Memoria instancia = new Memoria();
	private final List<MemoriaObservador> observadores =
											new ArrayList<>();
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual = "";
	private String textoBuffer = "";
	
	
	//a criação de momória só pode ser feita dentro da própria classe
	private Memoria() { 
		
	}
	//limitar Memoria para que só possa haver uma instancia
	//o unico jeito de pegar uma instancia da memória é através do getter,
	//já que o contrutor é privado
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador o) {
		observadores.add(o);
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty()? "0" : textoAtual;
	}
	
	public void processarComando(String valor){
		
		TipoComando tipoComando = detectarTipoComando(valor);
		
		if(tipoComando == null) {
			return;
		}else if(tipoComando == TipoComando.ZERAR) {
			//voltar tudo pro padrão
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
			
		}else if(tipoComando == TipoComando.INVERTE){
			//inverter sinal
			textoAtual = textoAtual.contains("-")? textoAtual.replace("-", "") :"-" + textoAtual;
			
		}else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir? textoAtual = valor : textoAtual + valor;
			//dependendo do valor do boolean "substituir", substitui OU acrescenta o valor
			substituir = false;
			
		}else {
			//operações
			substituir = true;
			textoAtual = obterResultadoOperacao();
			textoBuffer = textoAtual;
			
			ultimaOperacao = tipoComando;
			
		}
		
		
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}
	
	private String obterResultadoOperacao() {
		
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		//mudando "," para "." para que seja possivel efetuara a operação
		double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA) {
			// +
			resultado = numeroBuffer + numeroAtual;
		}else if(ultimaOperacao == TipoComando.SUB){
			// -
			resultado = numeroBuffer - numeroAtual;
		}else if(ultimaOperacao == TipoComando.MULT){
			// *
			resultado = numeroBuffer * numeroAtual;
		}else if(ultimaOperacao == TipoComando.DIV){
			// /
			resultado = numeroBuffer / numeroAtual;
		}
		
		String texto = Double.toString(resultado).replace(".", ",");
		boolean inteiro = texto.endsWith(",0");
		return inteiro? texto.replace(",0", ""): texto;
	}
	
	private TipoComando detectarTipoComando(String valor) {
		
			if(textoAtual.isEmpty() && valor == "0") {
				return null;
			}
			
			try {
				Integer.parseInt(valor);
				return TipoComando.NUMERO;
				
			}catch(NumberFormatException e){
				//Quando não for número: 
				if("AC".equalsIgnoreCase(valor)) {
					return TipoComando.ZERAR;
				}else if("/".equals(valor)) {
					return TipoComando.DIV;
				}else if("*".equals(valor)) {
					return TipoComando.MULT;
				}else if("+".equals(valor)) {
					return TipoComando.SOMA;
				}else if("-".equals(valor)) {
					return TipoComando.SUB;
				}else if("=".equals(valor)) {
					return TipoComando.IGUAL;
				}else if("±".equals(valor)) {
					return TipoComando.INVERTE;
				}else if(",".equals(valor) && !textoAtual.contains(",")){
					//não pode haver duas virgulas em um numero
					return TipoComando.VIRGULA;
				}
				
				
			}
		
		return null;
	}

}
