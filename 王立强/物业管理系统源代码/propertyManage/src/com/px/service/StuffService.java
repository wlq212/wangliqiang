package com.px.service;

import java.util.List;

import com.px.bean.Stuff;

public interface StuffService {
	List<Stuff> listAllStuff();
	List<Stuff> selectStuffBySno(int sno);
	List<Stuff> selectStuffBySname(String sname);
	int deleteBySno(int sno);
	int addStuff(Stuff stuff);
	int updateStuff(Stuff stuff);
	Stuff getStuff(String sname, String password);


}
