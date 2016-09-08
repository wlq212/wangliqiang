package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Repair;
import com.px.common.ConnectionFactory;

public class RepairDao {
	public List<Repair> listAllRepair() throws Exception{
		Repair repair = null;
		Connection conn = ConnectionFactory.getConn();
		List<Repair> repairs = new ArrayList<Repair>();
		String sql = "select * from repair";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			repair = new Repair();
			int rpno = rs.getInt("rpno");
			int rno = rs.getInt("rno");
			String content = rs.getString("content");
			int price = rs.getInt("price");
			String time = rs.getString("time");
			repair.setRpno(rpno);
			repair.setRno(rno);
			repair.setContent(content);
			repair.setPrice(price);
			repair.setTime(time);
			repairs.add(repair);
			
		}
		
		return repairs;
		
	}
	public List<Repair> selectRepairByRpno(int rpno) throws Exception{
		Repair repair = null;
		Connection conn = ConnectionFactory.getConn();
		List<Repair> repairs = new ArrayList<Repair>();
		String sql = "select * from repair where rpno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, rpno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			repair = new Repair();
			repair.setRpno(rs.getInt("rpno"));
			repair.setRno(rs.getInt("rno"));
			repair.setContent(rs.getString("content"));
			repair.setPrice(rs.getInt("price"));
			repair.setTime(rs.getString("time"));
			repairs.add(repair);
			
		}
		
		return repairs;
		
	}
	public int deleteByRpno(int rpno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from repair where rpno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, rpno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addRepair(Repair repair) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into repair values(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,repair.getRpno());
		pstmt.setInt(2, repair.getRno());
		pstmt.setString(3, repair.getContent());
		pstmt.setInt(4, repair.getPrice());
		pstmt.setString(5, repair.getTime());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateRepair(Repair repair) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update repair set rno=? , content=? , price=? ,time=? where rpno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,repair.getRno());
		pstmt.setString(2,repair.getContent());
		pstmt.setInt(3,repair.getPrice());
		pstmt.setString(4,repair.getTime());
		pstmt.setInt(5,repair.getRpno());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
