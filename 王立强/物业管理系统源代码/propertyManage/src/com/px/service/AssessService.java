package com.px.service;

import java.util.List;

import com.px.bean.Assess;

public interface AssessService {
	List<Assess> listAllAssess();
	List<Assess> selectAssessByAno(int ano);
	List<Assess> selectAssessByName(String name);
	int deleteByAno(int ano);
	int addAssess(Assess assess);
	int updateAssess(Assess assess);

}
