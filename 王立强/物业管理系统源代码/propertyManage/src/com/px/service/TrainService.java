package com.px.service;

import java.util.List;

import com.px.bean.Train;

public interface TrainService {
	List<Train> listAllTrain();
	List<Train> selectTrainByTno(int tno);
	List<Train> selectTrainByName(String name);
	int deleteByTno(int tno);
	int addTrain(Train train);
	int updateTrain(Train train);

}
