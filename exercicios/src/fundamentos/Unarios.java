package fundamentos;

public class Unarios {

	public static void main(String[] args) {
		
		int a= 1;
		int b = 2;
		//Forma p�s fixada colocar o operador p�s o operando
		a++;// isso equivale a a = a + 1
		a--;// isso equivale a a = a - 1
		
		//Forma pr� fixada colacor o operador pr� operando
		++a;// b = b + 1;
		--a;// b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == --b);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
