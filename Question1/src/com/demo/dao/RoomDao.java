package com.demo.dao;

import com.demo.beans.Room;

public interface RoomDao {

	void save(Room r);

	void changeRoomStatus(int id);

	Room bookRoom(String rtype, int cap);

}
