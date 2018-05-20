package br.com.aerotickets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 
 * @author braullio-soares
 *
 * Cria conexao com o banco PostgreSQL
 *
 */
public class DaoConnect {
	public Connection getConexao() {
		Connection conexao = null;
		String usuario = "postgres";
		String senha = "1234";
		String nomeBD = "aerotickets";
		
		try {
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + nomeBD,
					 usuario, senha);
			
			System.out.println("Conexao bem sucedida");
			
			conexao.close();
			
		} catch (Exception e) {

			System.out.println("Conexao falhou: " + e.getMessage());
		}
		return conexao;
		
	}
}
