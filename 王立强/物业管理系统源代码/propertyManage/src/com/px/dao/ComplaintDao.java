package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Complaint;
import com.px.common.ConnectionFactory;

public class ComplaintDao {
	public List<Complaint> listAllComplaint() throws Exception{
		Complaint complaint = null;
		Connection conn = ConnectionFactory.getConn();
		List<Complaint> complaints = new ArrayList<Complaint>();
		String sql = "select * from complaint";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			complaint = new Complaint();
			int cono = rs.getInt("cono");
			int uno = rs.getInt("uno");
			String name = rs.getString("name");
			String content = rs.getString("content");
			String time = rs.getString("time");
			complaint.setCono(cono);
			complaint.setUno(uno);
			complaint.setName(name);
			complaint.setContent(content);
			complaint.setTime(time);
			complaints.add(complaint);
			
		}
		
		return complaints;
		
	}
	public List<Complaint> selectComplaintByCono(int cono) throws Exception{
		Complaint complaint = null;
		Connection conn = ConnectionFactory.getConn();
		List<Complaint> complaints = new ArrayList<Complaint>();
		String sql = "select * from complaint where cono=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, cono);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			complaint = new Complaint();
			complaint.setCono(rs.getInt("cono"));
			complaint.setUno(rs.getInt("uno"));
			complaint.setName(rs.getString("name"));
			complaint.setContent(rs.getString("content"));
			complaint.setTime(rs.getString("time"));
			complaints.add(complaint);
			
		}
		
		return complaints;
		
	}
	public int deleteByCono(int cono) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from complaint where cono = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, cono);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addComplaint(Complaint complaint) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into complaint values(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,complaint.getCono());
		pstmt.setInt(2, complaint.getUno());
		pstmt.setString(3, complaint.getName());
		pstmt.setString(4, complaint.getContent());
		pstmt.setString(5, complaint.getTime());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateComplaint(Complaint complaint) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update complaint set content=? ,time=? where cono=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,complaint.getContent());
		pstmt.setString(2,complaint.getTime());
		pstmt.setInt(3,complaint.getCono());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
