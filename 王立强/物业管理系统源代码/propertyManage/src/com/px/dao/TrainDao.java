package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Train;
import com.px.common.ConnectionFactory;

public class TrainDao {
	public List<Train> listAllTrain() throws Exception{
		Train train = null;
		Connection conn = ConnectionFactory.getConn();
		List<Train> trains = new ArrayList<Train>();
		String sql = "select * from train";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			train = new Train();
			int tno = rs.getInt("tno");
			String content = rs.getString("content");
			String time = rs.getString("time");
			int sno = rs.getInt("sno");
			String name = rs.getString("name");
			String behave = rs.getString("behave");
			train.setTno(tno);
			train.setContent(content);
			train.setTime(time);
			train.setSno(sno);
			train.setName(name);
			train.setBehave(behave);
			trains.add(train);
			
		}
		
		return trains;
		
	}
	public List<Train> selectTrainByTno(int tno) throws Exception{
		Train train = null;
		Connection conn = ConnectionFactory.getConn();
		List<Train> trains = new ArrayList<Train>();
		String sql = "select * from train where tno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,tno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			train = new Train();
			train.setTno(rs.getInt("tno"));
			train.setContent(rs.getString("content"));
			train.setTime(rs.getString("time"));
			train.setSno(rs.getInt("sno"));
			train.setName(rs.getString("name"));
			train.setBehave(rs.getString("behave"));
			trains.add(train);
			
		}
		
		return trains;
		
	}
	public List<Train> selectTrainByName(String name) throws Exception{
		Train train = null;
		Connection conn = ConnectionFactory.getConn();
		List<Train> trains = new ArrayList<Train>();
		String sql = "select * from train where name=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,name);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			train = new Train();
			train.setTno(rs.getInt("tno"));
			train.setContent(rs.getString("content"));
			train.setTime(rs.getString("time"));
			train.setSno(rs.getInt("sno"));
			train.setName(rs.getString("name"));
			train.setBehave(rs.getString("behave"));
			trains.add(train);
			
		}
		
		return trains;
		
	}
	public int deleteByTno(int tno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from train where tno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, tno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addTrain(Train train) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into train values(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,train.getTno());
		pstmt.setString(2, train.getContent());
		pstmt.setString(3, train.getTime());
		pstmt.setInt(4, train.getSno());
		pstmt.setString(5, train.getName());
		pstmt.setString(6, train.getBehave());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateTrain(Train train) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update train set content=? , time=? ,behave=? where tno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,train.getContent());
		pstmt.setString(2,train.getTime());
		pstmt.setString(3,train.getBehave());
		pstmt.setInt(4, train.getTno());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
