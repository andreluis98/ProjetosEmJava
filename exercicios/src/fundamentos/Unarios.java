package fundamentos;

public class Unarios {

	public static void main(String[] args) {
		
		int a= 1;
		int b = 2;
		//Forma pós fixada colocar o operador pós o operando
		a++;// isso equivale a a = a + 1
		a--;// isso equivale a a = a - 1
		
		//Forma pré fixada colacor o operador pré operando
		++a;// b = b + 1;
		--a;// b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == --b);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
