package com.test.dbconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (PersonID, LastName, FirstName, Address, City)"
			+ "VALUES(?, ?, ?, ?, ?);";

	public static void main(String[] args) {
		
		Connection con = null;
		try {
			// Driver changes based on the database used Oracle/MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "@database4ME");
			// here sample is database name, root is username and password

			// ************ Using Statement *********//
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}

			// ************ Using Prepared Statement *************//
			PreparedStatement prepStmt = con.prepareStatement(SQL_INSERT);
			prepStmt.setInt(1, 15);
			prepStmt.setString(2, "Joseph");
			prepStmt.setString(3, "John");
			prepStmt.setString(4, "USA");
			prepStmt.setString(5, "New York");

			prepStmt.execute();

			System.out.println("Row inserted");

			// ************ Using Stored Procedure ***************//
			String storedProcedure = "{CALL GetAllEmployees()}";
			CallableStatement callStmt = con.prepareCall(storedProcedure);

			ResultSet callResult = callStmt.executeQuery();

			System.out.println("****** Stored Procedure results ********");
			while (callResult.next()) {
				System.out.println(callResult.getInt(1) + "  " + callResult.getString(2) + "  " + callResult.getString(3));
			}


		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// at last close the connection
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * MYSQL database table creation CREATE TABLE emp ( PersonID int, LastName
	 * varchar(255), FirstName varchar(255), Address varchar(255), City varchar(255)
	 * );
	 **/

}
