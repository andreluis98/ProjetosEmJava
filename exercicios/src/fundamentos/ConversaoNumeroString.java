package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//Conversao de variavel do Wrapper para String 
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		//Funçoes exclusivas para string
		//.length utilizado para saber quantos caracteres tem dentro da String
		
		Integer num2 = 10000;
		System.out.println(num2.toString().length());
		
		//Conversao de variavel do tipo primitivo para String e utilizar a função .length exclusiva
		//para strings
		int num3 = 10000;
		System.out.println(Integer.toString(num3).length());
		//Realizar conversao para String concatenando com outra string e utilizar a função .length exclusiva
		//para strings
		System.out.println((""+ num3).length());
		//Podemos realizar as conversoes para string com todos os tipos primitivos.
	}

}
