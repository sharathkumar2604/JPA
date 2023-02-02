package com.xworkz.pen.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.xworkz.pen.constants.SqlCredentials;

public class DBUtils {

	public static Connection getConnection() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),SqlCredentials.USERNAME.getValue(),SqlCredentials.PASSWORD.getValue());
		  return connection;
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
	}
	
}
