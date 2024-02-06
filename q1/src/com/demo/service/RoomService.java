package com.demo.service;

import java.util.HashSet;
import java.util.Scanner;

import com.demo.beans.Room;

public interface RoomService {
	void addNewRoom(int choice, Scanner scanner);

    void cancelRoomBooking(int roomId);

    void bookRoom(int roomId);

    void showAllRooms();
}
