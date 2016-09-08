package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Contract;
import com.px.common.ConnectionFactory;

public class ContractDao {
	public List<Contract> listAllContract() throws Exception{
		Contract contract = null;
		Connection conn = ConnectionFactory.getConn();
		List<Contract> contracts = new ArrayList<Contract>();
		String sql = "select * from contract";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			contract = new Contract();
			int cno = rs.getInt("cno");
			String content = rs.getString("content");
			String begintime = rs.getString("begintime");
			int time = rs.getInt("time");
			int sno = rs.getInt("sno");
			String name = rs.getString("name");
			contract.setCno(cno);
			contract.setContent(content);
			contract.setBegintime(begintime);
			contract.setTime(time);
			contract.setSno(sno);
			contract.setName(name);
			contracts.add(contract);
			
		}
		
		return contracts;
		
	}
	public List<Contract> selectContractBycno(int cno) throws Exception{
		Contract contract = null;
		Connection conn = ConnectionFactory.getConn();
		List<Contract> contracts = new ArrayList<Contract>();
		String sql = "select * from contract where cno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, cno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			contract = new Contract();
			contract.setCno(rs.getInt("cno"));
			contract.setContent(rs.getString("content"));
			contract.setBegintime(rs.getString("begintime"));
			contract.setTime(rs.getInt("time"));
			contract.setSno(rs.getInt("sno"));
			contract.setName(rs.getString("name"));
			contracts.add(contract);
			
		}
		
		return contracts;
		
	}
	public List<Contract> selectContractByName(String name) throws Exception{
		Contract contract = null;
		Connection conn = ConnectionFactory.getConn();
		List<Contract> contracts = new ArrayList<Contract>();
		String sql = "select * from contract where name=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			contract = new Contract();
			contract.setCno(rs.getInt("cno"));
			contract.setContent(rs.getString("content"));
			contract.setBegintime(rs.getString("begintime"));
			contract.setTime(rs.getInt("time"));
			contract.setSno(rs.getInt("sno"));
			contract.setName(rs.getString("name"));
			contracts.add(contract);
			
		}
		
		return contracts;
		
	}
	public int deleteByCno(int cno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from contract where cno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, cno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addContract(Contract contract) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into contract values(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,contract.getCno());
		pstmt.setString(2, contract.getContent());
		pstmt.setString(3, contract.getBegintime());
		pstmt.setInt(4, contract.getTime());
		pstmt.setInt(5, contract.getSno());
		pstmt.setString(6, contract.getName());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateContract(Contract contract) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update contract set content=? , begintime=? , time=? where cno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,contract.getContent());
		pstmt.setString(2,contract.getBegintime());
		pstmt.setInt(3,contract.getTime());
		pstmt.setInt(4, contract.getCno());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
