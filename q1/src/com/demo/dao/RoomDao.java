package com.demo.dao;

import java.util.HashSet;

import com.demo.beans.Room;

public interface RoomDao {
	void addRoom(Room room);

    void cancelBooking(int roomId);

    boolean bookRoom(int roomId);

    void showAllRooms();
}