package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //convers�o implicita
		System.out.println(a);
		//converter double para float  utilizando cast
		float b = (float) 1.0; //convers�o explicita (CAST)
		System.out.println(b);
		//Cenarios de CAST realizando convers�es de tipos primitivos com cast
		int c = 4;
		byte d = (byte) c; //convers�o explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f =(int) e;//convers�o explicita (CAST) 
		System.out.println(f);

	}

}
