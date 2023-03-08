package com.edubridge.smsapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLException;

public class DBConnection {
private	static java.sql.Connection conn;
//	static Connection conn;
	public static Connection createDBConnection() {
		
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection
			String url = "jdbc:mysql://localhost:3306/studentDB?useSSL=false";
			String userName = "root";
			String password = "root";
			
			conn = DriverManager.getConnection(url,userName,password);
		
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return conn;
	}

}