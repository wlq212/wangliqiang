package com.px.service.Impl;

import java.util.List;

import com.px.bean.Repair;
import com.px.dao.RepairDao;
import com.px.service.RepairService;

public class RepairServiceImpl implements RepairService{

	@Override
	public List<Repair> listAllRepair() {
		RepairDao dao = new RepairDao();
		List<Repair> list= null;
		try {
			list = dao.listAllRepair();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Repair> selectRepairByRpno(int rpno) {
		RepairDao dao = new RepairDao();
		List<Repair> list= null;
		try {
			list = dao.selectRepairByRpno(rpno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByRpno(int rpno) {
		RepairDao dao = new RepairDao();
		int num = 0;
		try {
			num = dao.deleteByRpno(rpno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addRepair(Repair repair) {
		RepairDao dao = new RepairDao();
		int num = 0;
		try {
			num = dao.addRepair(repair);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateRepair(Repair repair) {
		RepairDao dao = new RepairDao();
		int num = 0;
		try {
			num = dao.updateRepair(repair);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

}
