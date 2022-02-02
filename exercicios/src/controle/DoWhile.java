package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras magicas...");
			System.out.print("Quer Sair? ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("Por Favor!"));//Se o usuario digitar algima palavra diferente de por favor, o programa continuara perguntando a palavra magica
		
		System.out.println("Obrigado!");
		entrada.close();

	}

}
