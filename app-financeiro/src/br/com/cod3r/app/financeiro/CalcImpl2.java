package br.com.cod3r.app.financeiro;

import java.util.Arrays;

public class CalcImpl2 implements Calc{

	@Override
	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (total, num) -> total + num);
	}
	
	

}
