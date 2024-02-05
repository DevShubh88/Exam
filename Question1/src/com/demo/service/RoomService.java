package com.demo.service;

import com.demo.beans.Room;

public interface RoomService {

	void addNewRoom(int ch);

	void cancelRoom(int id);

	Room bookRoom(String rtype, int cap);

}
