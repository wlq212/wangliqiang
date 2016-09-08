package com.px.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.px.bean.Debt;
import com.px.common.ConnectionFactory;

public class DebtDao {
	public List<Debt> listAllDebt() throws Exception{
		Debt debt = null;
		Connection conn = ConnectionFactory.getConn();
		List<Debt> debts = new ArrayList<Debt>();
		String sql = "select * from debt";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			debt = new Debt();
			int dno = rs.getInt("dno");
			int rno = rs.getInt("rno");
			int price = rs.getInt("price");
			String time = rs.getString("time");
			String pay = rs.getString("pay");
			debt.setDno(dno);
			debt.setRno(rno);
			debt.setPrice(price);
			debt.setTime(time);
			debt.setPay(pay);
			debts.add(debt);
			
		}
		
		return debts;
		
	}
	public List<Debt> selectDebtByDno(int dno) throws Exception{
		Debt debt = null;
		Connection conn = ConnectionFactory.getConn();
		List<Debt> debts = new ArrayList<Debt>();
		String sql = "select * from debt where dno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, dno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			debt = new Debt();
			debt.setDno(rs.getInt("dno"));
			debt.setRno(rs.getInt("rno"));
			debt.setPrice(rs.getInt("price"));
			debt.setTime(rs.getString("time"));
			debt.setPay(rs.getString("pay"));
			debts.add(debt);
			
		}
		
		return debts;
		
	}
	public int deleteByDno(int dno) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "delete from debt where dno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, dno);
		int num = pstmt.executeUpdate();
		return num;
	}
	public int addDebt(Debt debt) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "insert into debt values(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,debt.getDno());
		pstmt.setInt(2, debt.getRno());
		pstmt.setInt(3, debt.getPrice());
		pstmt.setString(4, debt.getTime());
		pstmt.setString(5, debt.getPay());
		int num = pstmt.executeUpdate();
		return num;
		
	}
	public int updateDebt(Debt debt) throws Exception{
		Connection conn = ConnectionFactory.getConn();
		String sql = "update debt set rno=? ,  price=? ,time=? ,pay=? where dno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,debt.getRno());
		pstmt.setInt(2,debt.getPrice());
		pstmt.setString(3,debt.getTime());
		pstmt.setString(4,debt.getPay());
		pstmt.setInt(5,debt.getDno());
		int num = pstmt.executeUpdate();
		return num;
		
	}

}
