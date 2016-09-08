package com.px.service;

import java.util.List;

import com.px.bean.Use;

public interface UseService {
	List<Use> listAllUse();
	List<Use> selectUseByUno(int uno);
	int deleteByUno(int uno);
	int addUse(Use use);
	int updateUse(Use use);
	Use getUse(String uname, String password);

}
