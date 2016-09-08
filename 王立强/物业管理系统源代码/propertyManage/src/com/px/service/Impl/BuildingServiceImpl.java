package com.px.service.Impl;

import java.util.List;

import com.px.bean.Building;
import com.px.dao.BuildingDao;
import com.px.service.BuildingService;

public class BuildingServiceImpl implements BuildingService{

	@Override
	public List<Building> listAllBuilding() {
		BuildingDao dao = new BuildingDao();
		List<Building> list= null;
		try {
			list = dao.listAllBuilding();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Building> selectBuildingByBno(int bno) {
		BuildingDao dao = new BuildingDao();
		List<Building> list= null;
		try {
			list = dao.selectBuildingByBno(bno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByBno(int bno) {
		BuildingDao dao = new BuildingDao();
		int num = 0;
		try {
			num = dao.deleteByBno(bno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addBuilding(Building building) {
		BuildingDao dao = new BuildingDao();
		int num = 0;
		try {
			num = dao.addBuilding(building);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateBuilding(Building building) {
		BuildingDao dao = new BuildingDao();
		int num = 0;
		try {
			num = dao.updateBuilding(building);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

}
