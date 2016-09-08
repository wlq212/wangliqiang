package com.px.service.Impl;

import java.util.List;

import com.px.bean.Stuff;
import com.px.dao.StuffDao;
import com.px.service.StuffService;

public class StuffServiceImpl implements StuffService{

	@Override
	public List<Stuff> listAllStuff() {
		StuffDao dao = new StuffDao();
		List<Stuff> list = null;
		try {
			list = dao.listAllStuff();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Stuff> selectStuffBySno(int sno) {
		StuffDao dao = new StuffDao();
		List<Stuff> list = null;
		try {
			list = dao.selectStuffBySno(sno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteBySno(int sno) {
		StuffDao dao = new StuffDao();
		int num = 0;
				try {
					num = dao.deleteBySno(sno);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return num;
	}

	@Override
	public int addStuff(Stuff stuff) {
		StuffDao dao = new StuffDao();
		int num = 0;
				try {
					num = dao.addStuff(stuff);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return num;
	}

	@Override
	public int updateStuff(Stuff stuff) {
		StuffDao dao = new StuffDao();
		int num = 0;
				try {
					num = dao.updateStuff(stuff);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return num;
	}

	@Override
	public Stuff getStuff(String sname, String password) {
		StuffDao dao = new StuffDao();
		Stuff stuff = null;
		try {
			stuff = dao.getStuff(sname, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stuff;
	}

	@Override
	public List<Stuff> selectStuffBySname(String sname) {
		StuffDao dao = new StuffDao();
		List<Stuff> list = null;
		try {
			list = dao.selectStuffBySname(sname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
