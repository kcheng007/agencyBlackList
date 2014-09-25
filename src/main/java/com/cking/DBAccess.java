package com.cking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccess {

	public static void getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/mysql",
					"root", "root");
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 作用： 作者：chengkai 日期：2014-9-23
	 */
	public static void main(String[] args) {
		DBAccess.getConnection();
	}

}
