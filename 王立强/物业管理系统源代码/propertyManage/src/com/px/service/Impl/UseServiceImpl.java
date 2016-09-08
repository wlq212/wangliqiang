package com.px.service.Impl;

import java.util.List;

import com.px.bean.Use;
import com.px.dao.UseDao;
import com.px.service.UseService;

public class UseServiceImpl implements UseService{

	@Override
	public List<Use> listAllUse() {
		UseDao dao = new UseDao();
		List<Use> list = null;
		try {
			list = dao.listAllUse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Use> selectUseByUno(int uno) {
		UseDao dao = new UseDao();
		List<Use> list = null;
		try {
			list = dao.selectUseByUno(uno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByUno(int uno) {
		UseDao dao = new UseDao();
		int num = 0;
		try {
			num = dao.deleteByUno(uno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addUse(Use use) {
		UseDao dao = new UseDao();
		int num = 0;
		try {
			num = dao.addUse(use);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateUse(Use use) {
		UseDao dao = new UseDao();
		int num = 0;
		try {
			num = dao.updateUse(use);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public Use getUse(String uname, String password) {
		UseDao dao = new UseDao();
		Use use = null;
		try {
			use = dao.getUse(uname, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return use;
	}

}
