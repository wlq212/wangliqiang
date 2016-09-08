package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Village;
import com.px.common.ConnectionFactory;

public class VillageDao {
	public List<Village> listAllVillage() throws Exception{
		Village village = null;
		Connection conn = ConnectionFactory.getConn();
		List<Village> villages = new ArrayList<Village>();
		String sql = "select * from village";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			village = new Village();
			int vno = rs.getInt("vno");
			String name = rs.getString("name");
			String introduce = rs.getString("introduce");
			int sno = rs.getInt("sno");
			String admini = rs.getString("admini");
			int num = rs.getInt("num");
			village.setVno(vno);
			village.setName(name);
			village.setIntroduce(introduce);
			village.setSno(sno);
			village.setAdmini(admini);
			village.setNum(num);
			villages.add(village);
			
		}
		
		return villages;
		
	}
	public List<Village> selectVillageByVno(int vno) throws Exception{
		Village village = null;
		Connection conn = ConnectionFactory.getConn();
		List<Village> villages = new ArrayList<Village>();
		String sql = "select * from village where vno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, vno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			village = new Village();
			village.setVno(rs.getInt("vno"));
			village.setName(rs.getString("name"));
			village.setIntroduce(rs.getString("introduce"));
			village.setSno(rs.getInt("sno"));
			village.setAdmini(rs.getString("admini"));
			village.setNum(rs.getInt("num"));
			villages.add(village);
			
		}
		
		return villages;
		
	}
	public int deleteByVno(int vno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from village where vno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, vno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addVillage(Village village) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into village values(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,village.getVno());
		pstmt.setString(2, village.getName());
		pstmt.setString(3, village.getIntroduce());
		pstmt.setInt(4, village.getSno());
		pstmt.setString(5, village.getAdmini());
		pstmt.setInt(6, village.getNum());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateVillage(Village village) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update village set introduce=? , sno=? , admini=? where vno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,village.getIntroduce());
		pstmt.setInt(2,village.getSno());
		pstmt.setString(3,village.getAdmini());
		pstmt.setInt(4, village.getVno());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
