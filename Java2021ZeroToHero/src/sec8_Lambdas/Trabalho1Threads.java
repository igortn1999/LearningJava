package sec8_Lambdas;

public class Trabalho1Threads implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Trabalho#01");
		}
		
	}

}
