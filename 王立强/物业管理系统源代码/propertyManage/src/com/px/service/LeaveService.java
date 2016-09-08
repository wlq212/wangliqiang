package com.px.service;

import java.util.List;

import com.px.bean.Leave;

public interface LeaveService {
	List<Leave> listAllLeave();
	List<Leave> selectLeaveByLno(int lno);
	List<Leave> selectLeaveByName(String name);
	int deleteByLno(int lno);
	int addLeave(Leave leave);
	int updateLeave(Leave leave);

}
