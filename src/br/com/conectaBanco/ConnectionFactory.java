package br.com.conectaBanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection()  {
		
		
	      try {
	    	  //VAI TENTAR REGISTRAR O DRIVER PARA A CONEXÃO COM O BANCO
	    	  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	    	  
	    	  //RETORNA A CONEXÃO
	          return DriverManager.getConnection(
	  "jdbc:mysql://localhost/javabanco", "root", "");  // CONEXÃO COM O BANCO
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
}