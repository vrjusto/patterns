package br.com.vinicius.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author vinicius
 *
 */
public final class ConnectionFactory {
	
	private ConnectionFactory() {
		super();
	}
	
	public static Connection getConnection() throws SQLException {
		String user = "vini";
		String password = "123";
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", user, password);

		return conn;
	}
}
