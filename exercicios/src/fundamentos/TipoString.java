package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		//Função .charAt irá nos dizer qual a letra está no indice indicado nos parenteses
		System.out.println("Olá Pessoal".charAt(2));

		String s = "Boa Tarde";
		//Função s.concat concatena com a string o que for atribuido dentro dos parenteses
		System.out.println(s.concat("!!!"));
		//A Função startsWith verifica se a variavel inicia com a palavra informada dentro de parenteses 
		//Retona True -> se tiver e False -> se não tiver
		System.out.println(s.startsWith("Boa"));
		//A Função endsWith verifica se a variavel termina com a palavra informada dentro de parenteses 
		System.out.println(s.startsWith("Tarde"));
		//A Função length retorna quantos caracteres tem na variavel.
		System.out.println(s.length());
		

	}

}
