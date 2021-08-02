package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSeIgual2() {
		
		int a = 1+1;
		
		assertEquals(2, a);
		
	}
	
	@Test
	void testarSeIgual3() {
		int x = 2+ 10 - 9;
		
		assertEquals(3, x);
	}

}
