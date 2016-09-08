package com.px.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Stuff;
import com.px.common.ConnectionFactory;

public class StuffDao {
	public List<Stuff> listAllStuff() throws Exception{

		Stuff stuff = null;
		Connection conn = ConnectionFactory.getConn();
		List<Stuff> stuffs = new ArrayList<Stuff>();
		String sql = "select * from stuff";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			stuff = new Stuff();
			int sno = rs.getInt("sno");
			String sname = rs.getString("sname");
			String password = rs.getString("password");
			String sex = rs.getString("sex");
			int age = rs.getInt("age");
			String education = rs.getString("education");
			String address = rs.getString("address");
			String email = rs.getString("email");
			long phone = rs.getLong("phone");
			String status = rs.getString("status");
			String father = rs.getString("father");
			String fworkerplace = rs.getString("fworkerplace");
			String mother = rs.getString("mother");
			String mworkerplace = rs.getString("mworkerplace");
			stuff.setSno(sno);
			stuff.setSname(sname);
			stuff.setPassword(password);
			stuff.setSex(sex);
			stuff.setAge(age);
			stuff.setEducation(education);
			stuff.setAddress(address);
			stuff.setEmail(email);
			stuff.setPhone(phone);
			stuff.setStatus(status);
			stuff.setFather(father);
			stuff.setFworkerplace(fworkerplace);
			stuff.setMother(mother);
			stuff.setMworkerplace(mworkerplace);
			stuffs.add(stuff);
			
		}
		
		return stuffs;
		
	}
	public List<Stuff> selectStuffBySno(int sno) throws Exception{
		Stuff stuff = null;
		Connection conn = ConnectionFactory.getConn();
		List<Stuff> stuffs = new ArrayList<Stuff>();
		String sql = "select * from stuff where sno= ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			stuff = new Stuff();
			stuff.setSno(rs.getInt("sno"));
			stuff.setSname(rs.getString("sname"));
			stuff.setPassword(rs.getString("password"));
			stuff.setSex(rs.getString("sex"));
			stuff.setAge(rs.getInt("age"));
			stuff.setEducation(rs.getString("education"));
			stuff.setAddress(rs.getString("address"));
			stuff.setEmail(rs.getString("email"));
			stuff.setPhone(rs.getLong("phone"));
			stuff.setStatus(rs.getString("status"));
			stuff.setFather(rs.getString("father"));
			stuff.setFworkerplace(rs.getString("fworkerplace"));
			stuff.setMother(rs.getString("mother"));
			stuff.setMworkerplace(rs.getString("mworkerplace"));
			stuffs.add(stuff);
			
		}
		
		return stuffs;
		
	}
	public List<Stuff> selectStuffBySname(String sname) throws Exception{
		Stuff stuff = null;
		Connection conn = ConnectionFactory.getConn();
		List<Stuff> stuffs = new ArrayList<Stuff>();
		String sql = "select * from stuff where sname= ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sname);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			stuff = new Stuff();
			stuff.setSno(rs.getInt("sno"));
			stuff.setSname(rs.getString("sname"));
			stuff.setPassword(rs.getString("password"));
			stuff.setSex(rs.getString("sex"));
			stuff.setAge(rs.getInt("age"));
			stuff.setEducation(rs.getString("education"));
			stuff.setAddress(rs.getString("address"));
			stuff.setEmail(rs.getString("email"));
			stuff.setPhone(rs.getLong("phone"));
			stuff.setStatus(rs.getString("status"));
			stuff.setFather(rs.getString("father"));
			stuff.setFworkerplace(rs.getString("fworkerplace"));
			stuff.setMother(rs.getString("mother"));
			stuff.setMworkerplace(rs.getString("mworkerplace"));
			stuffs.add(stuff);
			
		}
		
		return stuffs;
		
	}
	public int deleteBySno(int sno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from stuff where sno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addStuff(Stuff stuff) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into stuff values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,stuff.getSno());
		pstmt.setString(2, stuff.getSname());
		pstmt.setString(3, stuff.getPassword());
		pstmt.setString(4, stuff.getSex());
		pstmt.setInt(5, stuff.getAge());
		pstmt.setString(6, stuff.getEducation());
		pstmt.setString(7, stuff.getAddress());
		pstmt.setString(8, stuff.getEmail());
		pstmt.setLong(9,stuff.getPhone());
		pstmt.setString(10, stuff.getStatus());
		pstmt.setString(11, stuff.getFather());
		pstmt.setString(12, stuff.getFworkerplace());
		pstmt.setString(13, stuff.getMother());
		pstmt.setString(14, stuff.getMworkerplace());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateStuff(Stuff stuff) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update stuff set education=? , address=? , email=? ,phone=? ,status=? where sno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,stuff.getEducation());
		pstmt.setString(2, stuff.getAddress());
		pstmt.setString(3, stuff.getEmail());
		pstmt.setLong(4,stuff.getPhone());
		pstmt.setString(5, stuff.getStatus());
		pstmt.setInt(6, stuff.getSno());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public Stuff getStuff(String sname, String password) throws Exception{
		Stuff stuff = null;
		String select_sql="select * from stuff where sname = ? and password = ?";
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
			conn = ConnectionFactory.getConn();
			pst = conn.prepareStatement(select_sql);
			pst.setString(1, sname);
			pst.setString(2, password);
			rs = pst.executeQuery();
			while(rs.next()){
				stuff = new Stuff();
				stuff.setSname(sname);
				stuff.setPassword(password);
			}
			rs.close();
			pst.close();
			conn.close();
		return stuff;
	}


}
