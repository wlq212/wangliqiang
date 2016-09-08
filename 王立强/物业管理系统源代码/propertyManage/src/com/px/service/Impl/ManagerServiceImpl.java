package com.px.service.Impl;

import com.px.bean.Manager;
import com.px.dao.ManagerDao;
import com.px.service.ManagerService;

public class ManagerServiceImpl implements ManagerService{

	@Override
	public Manager getManager(String mname, String password) {
		ManagerDao dao = new ManagerDao();
		Manager manager = null;
		try {
			manager = dao.getManager(mname, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return manager;
	}

}
