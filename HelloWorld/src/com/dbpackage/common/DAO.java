package com.dbpackage.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection getConnect() {
		Connection conn = null;
		String user = "user1";
		String passwd = "user1";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,passwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
