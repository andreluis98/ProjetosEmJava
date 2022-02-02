package controle;

public class For1 {

	public static void main(String[] args) {

		
		for(int contador = 1;contador <= 10;contador++) {
			System.out.printf("i = %d\n", contador);
		}
		//Podemos utilizar o for da seguinte forma tambem
		int x = 1;
		for(;x<=10;) {
			System.out.println("x = " + x);
			x++;
		}
		//Laço infinito
		for(;;) {
			System.out.println("Infinito");
		}
		
	}

}
