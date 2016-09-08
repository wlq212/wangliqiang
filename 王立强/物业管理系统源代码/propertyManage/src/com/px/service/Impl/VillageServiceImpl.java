package com.px.service.Impl;

import java.util.List;

import com.px.bean.Village;
import com.px.dao.VillageDao;
import com.px.service.VillageService;

public class VillageServiceImpl implements VillageService{

	@Override
	public List<Village> listAllVillage() {
		VillageDao dao = new VillageDao();
		List<Village> list= null;
		try {
			list = dao.listAllVillage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Village> selectVillageByVno(int vno) {
		VillageDao dao = new VillageDao();
		List<Village> list= null;
		try {
			list = dao.selectVillageByVno(vno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByVno(int vno) {
		VillageDao dao = new VillageDao();
		int num = 0;
		try {
			num = dao.deleteByVno(vno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addVillage(Village village) {
		VillageDao dao = new VillageDao();
		int num = 0;
		try {
			num = dao.addVillage(village);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateVillage(Village village) {
		VillageDao dao = new VillageDao();
		int num = 0;
		try {
			num = dao.updateVillage(village);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

}
