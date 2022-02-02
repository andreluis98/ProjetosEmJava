package fundamentos;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		//Operador logico E (AND)
		System.out.println(condicao1 && condicao2);
		//Operador logico OU (OR)
		System.out.println(condicao1 || condicao2);
		//Operador logico OU EXCLUSIVO (XOR)
		System.out.println(condicao1 ^ condicao2);
		//Não condição negação
		System.out.println(!condicao1);
		System.out.println(!condicao2);

		//Não condição Dupla negação
		System.out.println(!!condicao1);
		
		//Misturando Operador logico E (AND) e o Não Condição
		System.out.println(condicao1 && !condicao2);
		
		
		//Tabela Verdade E
		
		System.out.println("\nTabela Verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//Tabela Verdade OU
		System.out.println("\nTabela Verdade OU");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//Tabela Verdade OU EXCLUSIVO
		System.out.println("\nTabela Verdade OU EXCLUSIVO");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//Tabela Verdade NOT
		System.out.println("\nTabela Verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
		
	}

}
