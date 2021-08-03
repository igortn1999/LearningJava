package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo; 
	
	@BeforeEach
	void inicarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoRealDistanciaEsquerda() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistanciaDireita() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

}
