package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom Dia X";
		//Função substitui a string que for apontada.
		s = s.replace("X", "Senhora");
		//Função que deixa todas as letras em maiusculo.
		s = s.toUpperCase();
		
		System.out.println(s);
		
		
		//Tipos Primitivos não tem o operador .
	}

}
