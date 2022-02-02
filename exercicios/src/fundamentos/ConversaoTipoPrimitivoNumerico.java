package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //conversão implicita
		System.out.println(a);
		//converter double para float  utilizando cast
		float b = (float) 1.0; //conversão explicita (CAST)
		System.out.println(b);
		//Cenarios de CAST realizando conversões de tipos primitivos com cast
		int c = 4;
		byte d = (byte) c; //conversão explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f =(int) e;//conversão explicita (CAST) 
		System.out.println(f);

	}

}
