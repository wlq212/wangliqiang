package com.px.service;

import java.util.List;

import com.px.bean.Debt;

public interface DebtService {
	List<Debt> listAllDebt();
	List<Debt> selectDebtByDno(int dno);
	int deleteByDno(int dno);
	int addDebt(Debt debt);
	int updateDebt(Debt debt);

}
