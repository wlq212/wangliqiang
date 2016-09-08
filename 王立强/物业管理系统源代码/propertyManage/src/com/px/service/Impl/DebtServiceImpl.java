package com.px.service.Impl;

import java.util.List;

import com.px.bean.Debt;
import com.px.dao.DebtDao;
import com.px.service.DebtService;

public class DebtServiceImpl implements DebtService{

	@Override
	public List<Debt> listAllDebt() {
		DebtDao dao = new DebtDao();
		List<Debt> list= null;
		try {
			list = dao.listAllDebt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Debt> selectDebtByDno(int dno) {
		DebtDao dao = new DebtDao();
		List<Debt> list= null;
		try {
			list = dao.selectDebtByDno(dno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByDno(int dno) {
		DebtDao dao = new DebtDao();
		int num = 0;
		try {
			num = dao.deleteByDno(dno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addDebt(Debt debt) {
		DebtDao dao = new DebtDao();
		int num = 0;
		try {
			num = dao.addDebt(debt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateDebt(Debt debt) {
		DebtDao dao = new DebtDao();
		int num = 0;
		try {
			num = dao.updateDebt(debt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

}
