package com.demo.service;

import java.util.HashSet;
import java.util.Scanner;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;
import com.demo.beans.TrainingRoom;
import com.demo.dao.RoomDao;
import com.demo.dao.RoomDaoImpl;

public class RoomServiceImpl implements RoomService {
	 private RoomDao roomDao;

	    public RoomServiceImpl(RoomDao roomDao) {
	        this.roomDao = roomDao;
	    }

	    @Override
	    public void addNewRoom(int choice, Scanner scanner) {
	        System.out.println("Enter room ID:");
	        int roomId = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        System.out.println("Enter room type:");
	        String roomType = scanner.nextLine();
	        System.out.println("Enter room capacity:");
	        int capacity = scanner.nextInt();
	        System.out.println("Enter room price:");
	        double price = scanner.nextDouble();
	        scanner.nextLine(); // Consume newline

	        if (choice == 1) {
	            System.out.println("Enter TV make:");
	            String tvMake = scanner.nextLine();
	            System.out.println("Enter TV model:");
	            String tvModel = scanner.nextLine();
	            MeetingRoom meetingRoom = new MeetingRoom(roomId, roomType, capacity, price, tvMake, tvModel);
	            roomDao.addRoom(meetingRoom);
	        } else if (choice == 2) {
	            System.out.println("Enter telephone number:");
	            String telephoneNumber = scanner.nextLine();
	            TrainingRoom trainingRoom = new TrainingRoom(roomId, roomType, capacity, price, telephoneNumber);
	            roomDao.addRoom(trainingRoom);
	        } else {
	            System.out.println("Invalid choice.");
	        }
	    }

	    @Override
	    public void cancelRoomBooking(int roomId) {
	        roomDao.cancelBooking(roomId);
	    }

	    @Override
	    public void bookRoom(int roomId) {
	        roomDao.bookRoom(roomId);
	    }

	    @Override
	    public void showAllRooms() {
	        roomDao.showAllRooms();
	    }
}
