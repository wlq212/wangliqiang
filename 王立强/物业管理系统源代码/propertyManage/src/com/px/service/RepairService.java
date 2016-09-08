package com.px.service;

import java.util.List;

import com.px.bean.Repair;

public interface RepairService {
	List<Repair> listAllRepair();
	List<Repair> selectRepairByRpno(int rpno);
	int deleteByRpno(int rpno);
	int addRepair(Repair repair);
	int updateRepair(Repair repair);

}
