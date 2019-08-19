package br.com.alura.cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
		
		PreparedStatement ps = c.prepareStatement("Select * from tabela");
		
	}
	
}
