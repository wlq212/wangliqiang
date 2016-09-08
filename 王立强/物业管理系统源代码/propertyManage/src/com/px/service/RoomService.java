package com.px.service;

import java.util.List;

import com.px.bean.Room;

public interface RoomService {
	List<Room> listAllRoom();
	List<Room> selectRoomByRno(int rno);
	int deleteByRno(int rno);
	int addRoom(Room room);
	int updateRoom(Room room);

}
