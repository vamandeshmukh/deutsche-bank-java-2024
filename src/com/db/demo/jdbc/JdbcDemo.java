package com.db.demo.jdbc;

public class JdbcDemo {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String user = "System";
		String password = "oracle";
		String sql = "SELECT * FROM SYSTEM.EMPLOYEES";

	}

}
