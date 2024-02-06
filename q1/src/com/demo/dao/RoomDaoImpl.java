package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;

public class RoomDaoImpl implements RoomDao {
	 private Set<Room> rooms;

	    public RoomDaoImpl() {
	        rooms = new HashSet<>();
	    }

	    @Override
	    public void addRoom(Room room) {
	        if (!rooms.contains(room)) {
	            rooms.add(room);
	            System.out.println("Room added successfully.");
	        } else {
	            System.out.println("Room already exists.");
	        }
	    }

	    @Override
	    public void cancelBooking(int roomId) {
	        for (Room room : rooms) {
	            if (room.getRoomId() == roomId) {
	                room.setStatus("Available");
	                System.out.println("Booking for room " + roomId + " canceled.");
	                return;
	            }
	        }
	        System.out.println("Room not found.");
	    }

	    @Override
	    public boolean bookRoom(int roomId) {
	        for (Room room : rooms) {
	            if (room.getRoomId() == roomId && room.getStatus().equals("Available")) {
	                room.setStatus("Booked");
	                System.out.println("Room " + roomId + " booked successfully.");
	                return true;
	            }
	        }
	        System.out.println("Room not available for booking.");
	        return false;
	    }

	    @Override
	    public void showAllRooms() {
	        if (rooms.isEmpty()) {
	            System.out.println("No rooms available.");
	            return;
	        }
	        System.out.println("List of available rooms:");
	        for (Room room : rooms) {
	            System.out.println(room.getRoomId() + " - " + room.getRoomType() + " - " + room.getPrice() + " - " + room.getStatus());
	        }
	    }
	}