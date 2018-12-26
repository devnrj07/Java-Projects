package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface Dbutil {
	
	
default  Connection getDBConnection() {
		
		final String URL = "jdbc:mysql://localhost/new_database";
	    final String USER = "root";
	    final String PASS = "root";
	    Connection connection = null;
	           
	      try {
	         Class.forName("com.mysql.jdbc.Driver");
	          connection= DriverManager.getConnection(URL, USER, PASS);
	      } catch (SQLException sql) {sql.printStackTrace();}
	
	
	          catch( ClassNotFoundException ex) {
	          throw new RuntimeException("Error connecting to the database", ex);
	                                   }
	      return connection;
	     
	      } 


}
