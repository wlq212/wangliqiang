package com.px.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Assess;
import com.px.common.ConnectionFactory;

public class AssessDao {
	public List<Assess> listAllAssess() throws Exception{
		Assess assess = null;
		Connection conn = ConnectionFactory.getConn();
		List<Assess> assesss = new ArrayList<Assess>();
		String sql = "select * from assess";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			assess = new Assess();
			int ano = rs.getInt("ano");
			String content = rs.getString("content");
			String time = rs.getString("time");
			Integer sno = rs.getInt("sno");
			String name = rs.getString("name");
			String rank = rs.getString("rank");
			assess.setAno(ano);
			assess.setContent(content);
			assess.setTime(time);
			assess.setSno(sno);
			assess.setName(name);
			assess.setRank(rank);
			assesss.add(assess);
			
		}
		
		return assesss;
		
	}
	public List<Assess> selectAssessByAno(int ano) throws Exception{
		Assess assess = null;
		Connection conn = ConnectionFactory.getConn();
		List<Assess> assesss = new ArrayList<Assess>();
		String sql = "select * from assess where ano= ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ano);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			assess = new Assess();
			assess.setAno(rs.getInt("ano"));
			assess.setContent(rs.getString("content"));
			assess.setTime(rs.getString("time"));
			assess.setSno(rs.getInt("sno"));
			assess.setName(rs.getString("name"));
			assess.setRank(rs.getString("rank"));
			assesss.add(assess);
			
		}
		
		return assesss;
		
	}
	public List<Assess> selectAssessByName(String name) throws Exception{
		Assess assess = null;
		Connection conn = ConnectionFactory.getConn();
		List<Assess> assesss = new ArrayList<Assess>();
		String sql = "select * from assess where name= ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			assess = new Assess();
			assess.setAno(rs.getInt("ano"));
			assess.setContent(rs.getString("content"));
			assess.setTime(rs.getString("time"));
			assess.setSno(rs.getInt("sno"));
			assess.setName(rs.getString("name"));
			assess.setRank(rs.getString("rank"));
			assesss.add(assess);
			
		}
		
		return assesss;
		
	}
	public int deleteByAno(int ano) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from assess where ano = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ano);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addAssess(Assess assess) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into assess values(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,assess.getAno());
		pstmt.setString(2, assess.getContent());
		pstmt.setString(3, assess.getTime());
		pstmt.setInt(4,assess.getSno());
		pstmt.setString(5, assess.getName());
		pstmt.setString(6, assess.getRank());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateAssess(Assess assess) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update assess set content=? , time=? ,rank=? where ano=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,assess.getContent());
		pstmt.setString(2,assess.getTime());
		pstmt.setString(3,assess.getRank());
		pstmt.setInt(4, assess.getAno());
		int num = pstmt.executeUpdate();
		return num;
		
	}
}
