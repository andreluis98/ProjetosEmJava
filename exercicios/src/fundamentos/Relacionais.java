package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		//Operador para comparar se um objeto � igual a outro ==
		System.out.println(a == b);
		
		//Operador para comparar se � maior que > 
		System.out.println(3 > 4);
		//Operador para compara se � maior ou igual >= 
		System.out.println(3 >= 4);
		
		//Operador para comparar se � menor que < 
		System.out.println(3 < 7);

		//Operador para comparar se � menor ou igual que <= 
		System.out.println(30 <= 7);
	
	
		//Operador para comparar se � diferente != 
		System.out.println(30 != 7);
		
		double nota = 7.3; 
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem Desconto? " + temDesconto);
	}

}
