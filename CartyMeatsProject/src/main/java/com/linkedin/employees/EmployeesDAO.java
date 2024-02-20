package com.linkedin.employees;

import java.sql.*;
import java.util.*;

public enum EmployeesDAO {
	instance;
	private PreparedStatement pstmt = null;
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;
		
	final private String host ="127.0.0.1:3306";
	final private String user = "root";
	final private String password = "";
		
	public Connection getConnection() throws Exception {
		
		//Load MySQL Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Setup the connection with the DB
		con = DriverManager.getConnection("jdbc:mysql://" + host + "/employees?" + "user=" + user + "&password=" + password);
		return con;

	}
	
	public void registerEmployee(Employees employee) throws Exception {
        
        Connection con = getConnection();

		//Create the MySQL statement for inserting the employee
        try {
        	PreparedStatement pstmt = con.prepareStatement("INSERT INTO employee" +
            "  (first_name, last_name, username, passwrd, address, contact) VALUES " +
            " (?, ?, ?, ?, ?, ?);");
        	
        	pstmt.setString(1, employee.getFirst_name());
        	pstmt.setString(2, employee.getLast_name());
        	pstmt.setString(3, employee.getUsername());
        	pstmt.setString(4, employee.getPasswrd());
        	pstmt.setString(5, employee.getAddress());
        	pstmt.setString(6, employee.getContact());

            // Step 3: Execute the query or update query
            pstmt.executeUpdate();

        } catch (Exception e) {
            // process sql exception
        	e.printStackTrace();
        }
    }
	
}
