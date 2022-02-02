package fundamentos;

public class Temperatura {
	// Formula para converter Celsius em F
	// (F - 32) * 5.0/9.0 = C
	public static void main(String[] args) {
		
	
	final double  ajuste = 32;
	final double fator = 5.0/9.0;
	
	double fahrenheit = 86;
	
	double celsius = (fahrenheit - ajuste ) * fator;
	
	System.out.println("O Resultado é" + celsius + "C");
	}
}
