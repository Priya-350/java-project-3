/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author priya
 */

import java.sql.*;
public class DBConnection {

	 private static final String URL="jdbc:mysql://localhost:3306/BankManagement";
	 private static final String USERNAME="root";
	 private static final String PASSWORD="Priya@2004";
	 
	 public static Connection getConnection() throws SQLException {
		 return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	 }
}

