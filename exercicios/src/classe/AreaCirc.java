package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415;
	
	//Construtor
	AreaCirc(double raioInicial) {
		//PI = 3.14;
		raio = raioInicial;
	}
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	//Metodo Estatico
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
		
	}

}
