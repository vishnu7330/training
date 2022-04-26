package com.test.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

public class JDBCExample {

	private static final String SQL_INSERT = "INSERT INTO EMP (PersonID, LastName, FirstName, Address, City)"
			+ "VALUES(?, ?, ?, ?, ?);";

	public static void main(String[] args) {
		try {
			// Driver changes based on the database used Oracle/MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "@database4ME");
			// here sample is database name, root is username and password

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			PreparedStatement prepStmt = con.prepareStatement(SQL_INSERT);
			prepStmt.setInt(1, 15);
			prepStmt.setString(2, "Joseph");
			prepStmt.setString(3, "John");
			prepStmt.setString(4, "USA");
			prepStmt.setString(5, "New York");

			prepStmt.execute();

			System.out.println("Row inserted");

			// at last close the connection
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * MYSQL database table creation CREATE TABLE emp ( PersonID int, LastName
	 * varchar(255), FirstName varchar(255), Address varchar(255), City varchar(255)
	 * );
	 **/

}
