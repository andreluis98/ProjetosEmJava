package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		//Para acessar um tipo primitivo que está fora do metodo main é necessario criar uma instancia
		// ou tornando-o estatico
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b);
	}

}
