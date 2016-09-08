package com.px.service;

import java.util.List;

import com.px.bean.Contract;

public interface ContractService {
	List<Contract> listAllContract();
	List<Contract> selectContractBycno(int cno);
	List<Contract> selectContractByName(String name);
	int deleteByCno(int cno);
	int addContract(Contract contract);
	int updateContract(Contract contract);

}
