package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.util.ConnectionUtil;

public class JDBCLauncher {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionUtil cu = ConnectionUtil.getConnectionUtil();
		Connection conn = cu.getConnection();
		if(conn != null && !conn.isClosed()) {
			System.out.println("Whoopee");
		}
	}

}
