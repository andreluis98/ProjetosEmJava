package fundamentos;


public class wrapper {

	public static void main(String[] args) {
		
	
		
		//Byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		//byteValue mostra o valor do byte dentro da variavel apontada junto a fun��o.
		System.out.println(b.byteValue());
		//toString converte o valor numerico para String.
		System.out.println(s.toString());
		// a fun��o parseInt converte uma String em valor numerico(inteiro).
		
		//Realizando opera��es matematicas
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 132.456;
		System.out.println(d);
		
		
		// A fun��o parseBoolean converte o valor string em booleano(true ou false).
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		// A fun��o toStrin conver o valor booleano para string (texto).
		System.out.println(bo.toString());
		
		
		Character c = '#';
		
		

		
		
		

	}

}
