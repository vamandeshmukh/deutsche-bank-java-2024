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






//CREATE TABLE employees (id number(10) primary key, name varchar(40), salary number(8, 2));
//
//INSERT INTO employees (id, name, salary) VALUES (101, 'Sonu', 90.75);
//INSERT INTO employees (id, name, salary) VALUES (102, 'Monu', 95.50);
//INSERT INTO employees (id, name, salary) VALUES (103, 'Tonu', 92.25);
//
//COMMIT;
//
//SELECT * FROM employees;
