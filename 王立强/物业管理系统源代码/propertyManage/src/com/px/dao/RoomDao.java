package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Room;
import com.px.common.ConnectionFactory;

public class RoomDao {
	public List<Room> listAllRoom() throws Exception{
		Room room = null;
		Connection conn = ConnectionFactory.getConn();
		List<Room> rooms = new ArrayList<Room>();
		String sql = "select * from Room";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			room = new Room();
			int rno = rs.getInt("rno");
			String facility = rs.getString("facility");
			int area = rs.getInt("area");
			int uno = rs.getInt("uno");
			String name = rs.getString("name");
			int vno = rs.getInt("vno");
			String namee = rs.getString("namee");
			int bno = rs.getInt("bno");
			String nname = rs.getString("nname");
			String live = rs.getString("live");
			room.setRno(rno);
			room.setFacility(facility);
			room.setArea(area);
			room.setUno(uno);
			room.setName(name);
			room.setVno(vno);
			room.setNamee(namee);
			room.setBno(bno);
			room.setNname(nname);
			room.setLive(live);
			rooms.add(room);
			
		}
		
		return rooms;
		
	}
	public List<Room> selectRoomByRno(int rno) throws Exception{
		Room room = null;
		Connection conn = ConnectionFactory.getConn();
		List<Room> rooms = new ArrayList<Room>();
		String sql = "select * from room where rno =?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, rno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			room = new Room();
			room.setRno(rs.getInt("rno"));
			room.setFacility(rs.getString("facility"));
			room.setArea(rs.getInt("area"));
			room.setUno(rs.getInt("uno"));
			room.setName(rs.getString("name"));
			room.setVno(rs.getInt("vno"));
			room.setNamee(rs.getString("namee"));
			room.setBno(rs.getInt("bno"));
			room.setNname(rs.getString("nname"));
			room.setLive(rs.getString("live"));
			rooms.add(room);
			
		}
		
		return rooms;
		
	}
	public int deleteByRno(int rno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from room where rno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, rno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addRoom(Room room) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into room values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,room.getRno());
		pstmt.setString(2, room.getFacility());
		pstmt.setInt(3, room.getArea());
		pstmt.setInt(4, room.getUno());
		pstmt.setString(5, room.getName());
		pstmt.setInt(6, room.getVno());
		pstmt.setString(7, room.getNamee());
		pstmt.setInt(8, room.getBno());
		pstmt.setString(9, room.getNname());
		pstmt.setString(10, room.getLive());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateRoom(Room room) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update room set facility=? ,uno=? ,name=? where rno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,room.getFacility());
		pstmt.setInt(2, room.getUno());
		pstmt.setString(3, room.getName());
		pstmt.setInt(4, room.getRno());
		int num = pstmt.executeUpdate();
		return num;
		
	}


}
