package fundamentos;

public class Aritmeticos {

	public static void main(String[] args) {
		//Soma
		System.out.println(3 + 3);
		
		var x = 4.3;
		double y = 2.2;
		
		System.out.println(x + y);
		
		//subtra��o
		System.out.println(x - y);
		//Multiplica��o
		System.out.println(x * y);
		//Divis�o
		System.out.println(x / y);
		//Resto
		System.out.println(x % y);
		
		int a = 8;
		int b = 7;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);//convers�o do numero inteiro para double utilizanndo cast
		System.out.println(a % b);//convers�o do numero inteiro para float utilizanndo cast
		
		
		//Utilizar o resto da divis�o 
		System.out.println(8 % 3);
		
	}

}
