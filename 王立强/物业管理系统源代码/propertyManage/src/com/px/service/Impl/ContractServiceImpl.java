package com.px.service.Impl;

import java.util.List;
import com.px.bean.Contract;
import com.px.dao.ContractDao;
import com.px.service.ContractService;

public class ContractServiceImpl implements ContractService{

	@Override
	public List<Contract> listAllContract() {
		ContractDao dao = new ContractDao();
		List<Contract> list= null;
		try {
			list = dao.listAllContract();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Contract> selectContractBycno(int cno) {
			ContractDao dao = new ContractDao();
			List<Contract> list= null;
			try {
				list = dao.selectContractBycno(cno);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}


	@Override
	public int deleteByCno(int cno) {
		ContractDao dao = new ContractDao();
		int num = 0;
		try {
			num = dao.deleteByCno(cno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}


	@Override
	public int addContract(Contract contract) {
		ContractDao dao = new ContractDao();
		int num = 0;
		try {
			num = dao.addContract(contract);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateContract(Contract contract) {
		ContractDao dao = new ContractDao();
		int num = 0;
		try {
			num = dao.updateContract(contract);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public List<Contract> selectContractByName(String name) {
		ContractDao dao = new ContractDao();
		List<Contract> list= null;
		try {
			list = dao.selectContractByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
