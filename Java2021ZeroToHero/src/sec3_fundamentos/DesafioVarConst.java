package sec3_fundamentos;

public class DesafioVarConst {

	public static void main(String[] args) {
		
		double C, F=86;
		
		final int TDOIS=32; //CONST
		final double CPN= 5.0/9.0; //CONST
		
		C =(F-TDOIS)*CPN;
		
		System.out.println("C: "+C+"˚C");
		
	}

}
