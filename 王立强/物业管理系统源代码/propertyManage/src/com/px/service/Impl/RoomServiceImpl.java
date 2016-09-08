package com.px.service.Impl;

import java.util.List;

import com.px.bean.Room;
import com.px.dao.RoomDao;
import com.px.service.RoomService;

public class RoomServiceImpl implements RoomService{

	@Override
	public List<Room> listAllRoom() {
		RoomDao dao = new RoomDao();
		List<Room> list= null;
		try {
			list = dao.listAllRoom();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Room> selectRoomByRno(int rno) {
		RoomDao dao = new RoomDao();
		List<Room> list= null;
		try {
			list = dao.selectRoomByRno(rno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteByRno(int rno) {
		RoomDao dao = new RoomDao();
		int num = 0;
		try {
			num = dao.deleteByRno(rno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int addRoom(Room room) {
		RoomDao dao = new RoomDao();
		int num = 0;
		try {
			num = dao.addRoom(room);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updateRoom(Room room) {
		RoomDao dao = new RoomDao();
		int num = 0;
		try {
			num = dao.updateRoom(room);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

}
