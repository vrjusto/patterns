package br.com.vinicius.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestConnectionFactory {

	private static final Logger LOGGER = Logger.getLogger(TestConnectionFactory.class.getName() );	
	
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionFactory.getConnection();
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Connection error!");;
		}
	}
}
