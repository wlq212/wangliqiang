package com.px.service.Impl;

import java.util.List;

import com.px.bean.Complaint;
import com.px.dao.ComplaintDao;
import com.px.service.ComplaintService;

public class ComplaintServiceImpl implements ComplaintService{

	@Override
	public List<Complaint> listAllComplaint() {
		ComplaintDao dao = new ComplaintDao();
		List<Complaint> list= null;
		try {
			list = dao.listAllComplaint();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Complaint> selectComplaintByCono(int cono) {
		ComplaintDao dao = new ComplaintDao();
		List<Complaint> list= null;
		try {
			list = dao.selectComplaintByCono(cono);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByCono(int cono) {
		ComplaintDao dao = new ComplaintDao();
		int num = 0;
		try {
			num = dao.deleteByCono(cono);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addComplaint(Complaint complaint) {
		ComplaintDao dao = new ComplaintDao();
		int num = 0;
		try {
			num = dao.addComplaint(complaint);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateComplaint(Complaint complaint) {
		ComplaintDao dao = new ComplaintDao();
		int num = 0;
		try {
			num = dao.updateComplaint(complaint);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

}
