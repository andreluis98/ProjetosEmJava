package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		//Fun��o .charAt ir� nos dizer qual a letra est� no indice indicado nos parenteses
		System.out.println("Ol� Pessoal".charAt(2));

		String s = "Boa Tarde";
		//Fun��o s.concat concatena com a string o que for atribuido dentro dos parenteses
		System.out.println(s.concat("!!!"));
		//A Fun��o startsWith verifica se a variavel inicia com a palavra informada dentro de parenteses 
		//Retona True -> se tiver e False -> se n�o tiver
		System.out.println(s.startsWith("Boa"));
		//A Fun��o endsWith verifica se a variavel termina com a palavra informada dentro de parenteses 
		System.out.println(s.startsWith("Tarde"));
		//A Fun��o length retorna quantos caracteres tem na variavel.
		System.out.println(s.length());
		

	}

}
