package com.auribises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCHelper {

	
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	
	
	public JDBCHelper() {
	
		

	try {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("--Driver Loaded--");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	
	public void openConnection() {
		
		try {
			String url="jdbc:mysql://localhost/GW2017A";
			String user="root";
			String password="";
			
			con=DriverManager.getConnection(url, user, password);
			System.out.println("--Connection opened--");
		} catch (Exception e) {
		
			
		System.out.println("Some Exception: "+e);
		}
		
	}
	
	void insertEmployee(Employee emp) {
		
		try {
			
			//String sql="insert into Employee values(" + emp.getId() + ",'" + emp.getName() + "'," + emp.getAge() + ",'" + emp.getEmail() + "','" + emp.getAddress() + "')";
			 
			
			//stmt=con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			String sql= "insert into Employee values(?,?,?,?,?)";
			
			pStmt =con.prepareStatement(sql);
			pStmt.setInt(1,emp.getId());
			pStmt.setString(2,emp.getName());
			pStmt.setInt(3,emp.getAge());
			pStmt.setString(4,emp.getEmail());
			pStmt.setString(5,emp.getAddress());
			
			
			
			int i =pStmt.executeUpdate();
			
			
			System.out.println(i+ "Row(s) inserted");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	void closeConnection() {
		
		try {
			
			con.close();
			System.out.println("--Connection Closed--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		
	}
	
}
