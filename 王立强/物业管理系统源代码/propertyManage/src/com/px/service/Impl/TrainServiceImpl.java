package com.px.service.Impl;

import java.util.List;

import com.px.bean.Train;
import com.px.dao.TrainDao;
import com.px.service.TrainService;

public class TrainServiceImpl implements TrainService{

	@Override
	public List<Train> listAllTrain() {
		TrainDao dao = new TrainDao();
		List<Train> list= null;
		try {
			list = dao.listAllTrain();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Train> selectTrainByTno(int tno) {
		TrainDao dao = new TrainDao();
		List<Train> list= null;
		try {
			list = dao.selectTrainByTno(tno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByTno(int tno) {
		TrainDao dao = new TrainDao();
		int num = 0;
		try {
			num = dao.deleteByTno(tno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addTrain(Train train) {
		TrainDao dao = new TrainDao();
		int num = 0;
		try {
			num = dao.addTrain(train);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateTrain(Train train) {
		TrainDao dao = new TrainDao();
		int num = 0;
		try {
			num = dao.updateTrain(train);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public List<Train> selectTrainByName(String name) {
		TrainDao dao = new TrainDao();
		List<Train> list= null;
		try {
			list = dao.selectTrainByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
