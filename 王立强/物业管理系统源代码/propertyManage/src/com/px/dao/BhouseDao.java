package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Bhouse;
import com.px.common.ConnectionFactory;

public class BhouseDao {
	public List<Bhouse> listAllBhouse() throws Exception{
		Bhouse bhouse = null;
		Connection conn = ConnectionFactory.getConn();
		List<Bhouse> bhouses = new ArrayList<Bhouse>();
		String sql = "select * from bhouse";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			bhouse = new Bhouse();
			int bhno = rs.getInt("bhno");
			int rno = rs.getInt("rno");
			String time = rs.getString("time");
			String style = rs.getString("style");
			String retur = rs.getString("retur");
			bhouse.setBhno(bhno);
			bhouse.setRno(rno);
			bhouse.setTime(time);
			bhouse.setStyle(style);
			bhouse.setRetur(retur);
			bhouses.add(bhouse);
			
		}
		
		return bhouses;
		
	}
	public List<Bhouse> selectBhouseByBhno(int bhno) throws Exception{
		Bhouse bhouse = null;
		Connection conn = ConnectionFactory.getConn();
		List<Bhouse> bhouses = new ArrayList<Bhouse>();
		String sql = "select * from bhouse where bhno=? " ;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bhno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			bhouse = new Bhouse();
			bhouse.setBhno(rs.getInt("bhno"));
			bhouse.setRno(rs.getInt("rno"));
			bhouse.setTime(rs.getString("time"));
			bhouse.setStyle(rs.getString("style"));
			bhouse.setRetur(rs.getString("retur"));
			bhouses.add(bhouse);
			
		}
		
		return bhouses;
		
	}
	public int deleteByBhno(int bhno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from bhouse where bhno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bhno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addBhouse(Bhouse bhouse) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into bhouse values(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,bhouse.getBhno());
		pstmt.setInt(2, bhouse.getRno());
		pstmt.setString(3, bhouse.getTime());
		pstmt.setString(4, bhouse.getStyle());
		pstmt.setString(5, bhouse.getRetur());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateBhouse(Bhouse bhouse) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update bhouse set rno=? , time=? , style=? ,retur=? where bhno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,bhouse.getRno());
		pstmt.setString(2,bhouse.getTime());
		pstmt.setString(3,bhouse.getStyle());
		pstmt.setString(4,bhouse.getRetur());
		pstmt.setInt(5,bhouse.getBhno());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
