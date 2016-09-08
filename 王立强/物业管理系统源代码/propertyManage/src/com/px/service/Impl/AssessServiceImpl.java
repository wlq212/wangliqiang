package com.px.service.Impl;

import java.util.List;

import com.px.bean.Assess;
import com.px.dao.AssessDao;
import com.px.service.AssessService;

public class AssessServiceImpl implements AssessService{

	@Override
	public List<Assess> listAllAssess() {
		AssessDao dao = new AssessDao();
		List<Assess> list= null;
		try {
			list = dao.listAllAssess();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public List<Assess> selectAssessByAno(int ano) {
		AssessDao dao = new AssessDao();
		List<Assess> list= null;
		try {
			list = dao.selectAssessByAno(ano);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByAno(int ano) {
		AssessDao dao = new AssessDao();
		int num = 0;
		try {
			num = dao.deleteByAno(ano);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addAssess(Assess assess) {
		AssessDao dao = new AssessDao();
		int num = 0;
		try {
			num = dao.addAssess(assess);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateAssess(Assess assess) {
		AssessDao dao = new AssessDao();
		int num = 0;
		try {
			num = dao.updateAssess(assess);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public List<Assess> selectAssessByName(String name) {
		AssessDao dao = new AssessDao();
		List<Assess> list= null;
		try {
			list = dao.selectAssessByName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
