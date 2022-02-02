package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o c�digo: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo > ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa Excluida com sucesso!");
			System.out.println("Linhas Afetadas: " + contador);
		}else {
			System.out.println("Nada Feito!");
		}
		
		conexao.close();
		entrada.close();
		
	}

}
