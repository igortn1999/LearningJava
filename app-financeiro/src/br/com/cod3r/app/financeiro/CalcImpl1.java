package br.com.cod3r.app.financeiro;

public class CalcImpl1 implements Calc{

	@Override
	public double soma(double... nums) {
		double total = 0;
		
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		return total;
	}
	
	

}
