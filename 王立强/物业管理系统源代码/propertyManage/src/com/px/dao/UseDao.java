package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Use;
import com.px.common.ConnectionFactory;

public class UseDao {
	public List<Use> listAllUse() throws Exception{
		Use use = null;
		Connection conn = ConnectionFactory.getConn();
		List<Use> uses = new ArrayList<Use>();
		String sql = "select * from use";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			use = new Use();
			int uno = rs.getInt("uno");
			String uname = rs.getString("uname");
			String password = rs.getString("password");
			String sex = rs.getString("sex");
			int age = rs.getInt("age");
			String carid = rs.getString("carid");
			String pet = rs.getString("pet");
			long phone = rs.getLong("phone");
			String father = rs.getString("father");
			String mother = rs.getString("mother");
			use.setUno(uno);
			use.setUname(uname);
			use.setPassword(password);
			use.setSex(sex);
			use.setAge(age);
			use.setCarid(carid);
			use.setPet(pet);
			use.setPhone(phone);
			use.setFather(father);
			use.setMother(mother);
			uses.add(use);
			
		}
		
		return uses;
		
	}
	public List<Use> selectUseByUno(int uno) throws Exception{
		Use use = null;
		Connection conn = ConnectionFactory.getConn();
		List<Use> uses = new ArrayList<Use>();
		String sql = "select * from use where uno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, uno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			use = new Use();
			use.setUno(rs.getInt("uno"));
			use.setUname(rs.getString("uname"));
			use.setPassword(rs.getString("password"));
			use.setSex(rs.getString("sex"));
			use.setAge(rs.getInt("age"));
			use.setCarid(rs.getString("carid"));
			use.setPet(rs.getString("pet"));
			use.setPhone( rs.getLong("phone"));
			use.setFather(rs.getString("father"));
			use.setMother(rs.getString("mother"));
			uses.add(use);
			
		}
		
		return uses;
		
	}
	public int deleteByUno(int uno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from use where uno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, uno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addUse(Use use) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into use values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,use.getUno());
		pstmt.setString(2, use.getUname());
		pstmt.setString(3, use.getPassword());
		pstmt.setString(4, use.getSex());
		pstmt.setInt(5, use.getAge());
		pstmt.setString(6, use.getCarid());
		pstmt.setString(7, use.getPet());
		pstmt.setLong(8,use.getPhone());
		pstmt.setString(9, use.getFather());
		pstmt.setString(10, use.getMother());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateUse(Use use) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update use set carid=? , pet=? , phone=? where uno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,use.getCarid());
		pstmt.setString(2,use.getPet());
		pstmt.setLong(3,use.getPhone());
		pstmt.setInt(4, use.getUno());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public Use getUse(String uname, String password) throws Exception{
		Use use = null;
		String select_sql="select * from use where uname = ? and password = ?";
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
			conn = ConnectionFactory.getConn();
			pst = conn.prepareStatement(select_sql);
			pst.setString(1, uname);
			pst.setString(2, password);
			rs = pst.executeQuery();
			while(rs.next()){
				use = new Use();
				use.setUname(uname);
				use.setPassword(password);
			}
			rs.close();
			pst.close();
			conn.close();
		return use;
	}

}
