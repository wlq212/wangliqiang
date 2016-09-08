package com.px.service.Impl;

import java.util.List;

import com.px.bean.Bhouse;
import com.px.dao.BhouseDao;
import com.px.service.BhouseService;

public class BhouseServiceImpl implements BhouseService{

	@Override
	public List<Bhouse> listAllBhouse() {
		BhouseDao dao = new BhouseDao();
		List<Bhouse> list= null;
		try {
			list = dao.listAllBhouse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Bhouse> selectBhouseByBhno(int bhno) {
		BhouseDao dao = new BhouseDao();
		List<Bhouse> list= null;
		try {
			list = dao.selectBhouseByBhno(bhno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByBhno(int bhno) {
		BhouseDao dao = new BhouseDao();
		int num = 0;
		try {
			num = dao.deleteByBhno(bhno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addBhouse(Bhouse bhouse) {
		BhouseDao dao = new BhouseDao();
		int num = 0;
		try {
			num = dao.addBhouse(bhouse);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateBhouse(Bhouse bhouse) {
		BhouseDao dao = new BhouseDao();
		int num = 0;
		try {
			num = dao.updateBhouse(bhouse);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

}
