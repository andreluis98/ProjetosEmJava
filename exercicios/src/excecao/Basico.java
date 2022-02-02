package excecao;

public class Basico {
	
	public static void main(String[] args) {
		Aluno a1 = null;
		try {
			imprimirNomeDoAluno(a1);
			
		}catch (Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do ususario");
		}
		//Vai ocorrer erro 
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("Ocorreu o erro " + e.getMessage() );
		}
	}
	//Vai ocorrer erro
	public static void imprimirNomeDoAluno(Aluno aluno) {
		
		System.out.println(aluno.nome);
	}
	
	
	
}
