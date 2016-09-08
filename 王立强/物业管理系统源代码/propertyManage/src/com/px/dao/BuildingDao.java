package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Building;
import com.px.common.ConnectionFactory;

public class BuildingDao {
	public List<Building> listAllBuilding() throws Exception{
		Building building = null;
		Connection conn = ConnectionFactory.getConn();
		List<Building> buildings = new ArrayList<Building>();
		String sql = "select * from building";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			building = new Building();
			int bno = rs.getInt("bno");
			String name = rs.getString("name");
			String style = rs.getString("style");
			int height = rs.getInt("height");
			int uno = rs.getInt("uno");
			String admini = rs.getString("admini");
			int num = rs.getInt("num");
			int vno = rs.getInt("vno");
			String namee = rs.getString("namee");
			building.setBno(bno);
			building.setName(name);
			building.setStyle(style);
			building.setHeight(height);
			building.setUno(uno);
			building.setAdmini(admini);
			building.setNum(num);
			building.setVno(vno);
			building.setNamee(namee);
			buildings.add(building);
			
		}
		
		return buildings;
		
	}
	public List<Building> selectBuildingByBno(int bno) throws Exception{
		Building building = null;
		Connection conn = ConnectionFactory.getConn();
		List<Building> buildings = new ArrayList<Building>();
		String sql = "select * from building where bno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			building = new Building();
			building.setBno(rs.getInt("bno"));
			building.setName(rs.getString("name"));
			building.setStyle(rs.getString("style"));
			building.setHeight(rs.getInt("height"));
			building.setUno(rs.getInt("uno"));
			building.setAdmini(rs.getString("admini"));
			building.setNum(rs.getInt("num"));
			building.setVno(rs.getInt("vno"));
			building.setNamee(rs.getString("namee"));
			buildings.add(building);
			
		}
		
		return buildings;
		
	}
	public int deleteByBno(int bno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from building where bno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addBuilding(Building building) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into building values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,building.getBno());
		pstmt.setString(2, building.getName());
		pstmt.setString(3, building.getStyle());
		pstmt.setInt(4, building.getHeight());
		pstmt.setInt(5, building.getUno());
		pstmt.setString(6, building.getAdmini());
		pstmt.setInt(7, building.getNum());
		pstmt.setInt(8, building.getVno());
		pstmt.setString(9, building.getNamee());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateBuilding(Building building) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update building set uno=? ,admini=?, num=? where bno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,building.getUno());
		pstmt.setString(2,building.getAdmini());
		pstmt.setInt(3, building.getNum());
		pstmt.setInt(4, building.getBno());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
