package com.px.service;

import java.util.List;

import com.px.bean.Bhouse;

public interface BhouseService {
	List<Bhouse> listAllBhouse();
	List<Bhouse> selectBhouseByBhno(int bhno);
	int deleteByBhno(int bhno);
	int addBhouse(Bhouse bhouse);
	int updateBhouse(Bhouse bhouse);

}
