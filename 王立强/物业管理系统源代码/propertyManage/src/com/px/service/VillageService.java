package com.px.service;

import java.util.List;

import com.px.bean.Village;

public interface VillageService {
	List<Village> listAllVillage();
	List<Village> selectVillageByVno(int vno);
	int deleteByVno(int vno);
	int addVillage(Village village);
	int updateVillage(Village village);

}
