package com.px.service;

import java.util.List;

import com.px.bean.Building;

public interface BuildingService {
	List<Building> listAllBuilding();
	List<Building> selectBuildingByBno(int bno);
	int deleteByBno(int bno);
	int addBuilding(Building building);
	int updateBuilding(Building building);

}
