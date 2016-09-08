package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Leave;
import com.px.common.ConnectionFactory;

public class LeaveDao {
	public List<Leave> listAllLeave() throws Exception{
		Leave leave = null;
		Connection conn = ConnectionFactory.getConn();
		List<Leave> leaves = new ArrayList<Leave>();
		String sql = "select * from Leave";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			leave = new Leave();
			int lno = rs.getInt("lno");
			String reason = rs.getString("reason");
			String time = rs.getString("time");
			int sno = rs.getInt("sno");
			String name = rs.getString("name");
			leave.setLno(lno);
			leave.setReason(reason);
			leave.setTime(time);
			leave.setSno(sno);
			leave.setName(name);
			leaves.add(leave);
			
		}
		
		return leaves;
		
	}
	public List<Leave> selectLeaveByLno(int lno) throws Exception{
		Leave leave = null;
		Connection conn = ConnectionFactory.getConn();
		List<Leave> leaves = new ArrayList<Leave>();
		String sql = "select * from leave where lno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, lno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			leave = new Leave();
			leave.setLno(rs.getInt("lno"));
			leave.setReason(rs.getString("reason"));
			leave.setTime(rs.getString("time"));
			leave.setSno(rs.getInt("sno"));
			leave.setName(rs.getString("name"));
			leaves.add(leave);
			
		}
		
		return leaves;
		
	}
	public List<Leave> selectLeaveByName(String name) throws Exception{
		Leave leave = null;
		Connection conn = ConnectionFactory.getConn();
		List<Leave> leaves = new ArrayList<Leave>();
		String sql = "select * from leave where name=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			leave = new Leave();
			leave.setLno(rs.getInt("lno"));
			leave.setReason(rs.getString("reason"));
			leave.setTime(rs.getString("time"));
			leave.setSno(rs.getInt("sno"));
			leave.setName(rs.getString("name"));
			leaves.add(leave);
			
		}
		
		return leaves;
		
	}
	public int deleteByLno(int lno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from leave where lno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, lno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addLeave(Leave leave) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into leave values(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,leave.getLno());
		pstmt.setString(2, leave.getReason());
		pstmt.setString(3, leave.getTime());
		pstmt.setInt(4, leave.getSno());
		pstmt.setString(5, leave.getName());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateLeave(Leave leave) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update leave set reason=? , time=? where lno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,leave.getReason());
		pstmt.setString(2,leave.getTime());
		pstmt.setInt(3, leave.getLno());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
