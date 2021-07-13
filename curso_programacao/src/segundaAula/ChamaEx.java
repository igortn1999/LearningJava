package segundaAula;

public class ChamaEx {
	
	private String product;
	private int code;
	private double price;
	
	public ChamaEx(String product, int code, double price) {
		
		this.product = product;
		this.code = code;
		this.price = price;
		
		//printa();
		
	}
	
	public void printa() {
		
		System.out.println("\n--------------------------------\n"
							+"Produto: "+ product
							+"\nCodigo: "+ code
							+ "\nPreço: " + price);
	}

}
