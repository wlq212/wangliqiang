package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.px.bean.Manager;
import com.px.common.ConnectionFactory;

public class ManagerDao {
	public Manager getManager(String mname, String password) throws Exception{
		Manager manager = null;
		String select_sql="select * from manager where mname = ? and password = ?";
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
			conn = ConnectionFactory.getConn();
			pst = conn.prepareStatement(select_sql);
			pst.setString(1, mname);
			pst.setString(2, password);
			rs = pst.executeQuery();
			while(rs.next()){
				manager = new Manager();
				manager.setMname(mname);
				manager.setPassword(password);
			}
			rs.close();
			pst.close();
			conn.close();
		return manager;
	}


}
