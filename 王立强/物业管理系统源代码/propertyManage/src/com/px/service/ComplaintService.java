package com.px.service;

import java.util.List;

import com.px.bean.Complaint;

public interface ComplaintService {
	List<Complaint> listAllComplaint();
	List<Complaint> selectComplaintByCono(int cono);
	int deleteByCono(int cono);
	int addComplaint(Complaint complaint);
	int updateComplaint(Complaint complaint);

}
