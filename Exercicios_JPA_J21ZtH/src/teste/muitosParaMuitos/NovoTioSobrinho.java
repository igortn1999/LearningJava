package teste.muitosParaMuitos;

import infra.DAO;
import modelo.muitosParaMuitos.Sobrinho;
import modelo.muitosParaMuitos.Tio;

public class NovoTioSobrinho {
	
	public static void main(String[] args) {
		
		Tio tia1 = new Tio("Maria");
		Tio tio2 = new Tio("João");
		
		Sobrinho sobrinho1 = new Sobrinho("Davi");
		Sobrinho sobrinha2 = new Sobrinho("Ana");
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		//relação bidirecional sendo definida (adiciona sobrinho no tio e vice versa)
		
		tia1.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirTransacao()
		.incluir(tia1)
		.incluir(tio2)
		.incluir(sobrinho1)
		.incluir(sobrinha2)
		.fecharTransacao()
		.fechar();
		//essa bidirecionalidade dá muito trabalho pra ser inserida manualmente, o ideal é criar métodos
		//para facilitar esse processo
		
	}

}
