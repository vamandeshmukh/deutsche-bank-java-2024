package com.db.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String user = "System";
		String password = "oracle";
		String sql = "SELECT * FROM SYSTEM.EMPLOYEES";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);


		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("first_name") + " " + rs.getDouble("salary"));
		}
		rs.close();
		stmt.close();
		conn.close();

	}

}
