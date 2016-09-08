package com.px.service.Impl;

import java.util.List;

import com.px.bean.Leave;
import com.px.dao.LeaveDao;
import com.px.service.LeaveService;

public class LeaveServiceImpl implements LeaveService{

	@Override
	public List<Leave> listAllLeave() {
		LeaveDao dao = new LeaveDao();
		List<Leave> list= null;
		try {
			list = dao.listAllLeave();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Leave> selectLeaveByLno(int lno) {
		LeaveDao dao = new LeaveDao();
		List<Leave> list= null;
		try {
			list = dao.selectLeaveByLno(lno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByLno(int lno) {
		LeaveDao dao = new LeaveDao();
		int num = 0;
		try {
			num = dao.deleteByLno(lno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addLeave(Leave leave) {
		LeaveDao dao = new LeaveDao();
		int num = 0;
		try {
			num = dao.addLeave(leave);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateLeave(Leave leave) {
		LeaveDao dao = new LeaveDao();
		int num = 0;
		try {
			num = dao.updateLeave(leave);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public List<Leave> selectLeaveByName(String name) {
		LeaveDao dao = new LeaveDao();
		List<Leave> list= null;
		try {
			list = dao.selectLeaveByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	}

