package com.px.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String user="use";
	private static String password="ud";
	public static Connection getConn() throws Exception{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
}
