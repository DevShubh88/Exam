package com.demo.beans;
import java.util.*;


// Room class
 public class Room {
	 private int roomId;
	    private String roomType;
	    private int capacity;
	    private double price;
	    private String status;

	    public Room(int roomId, String roomType, int capacity, double price) {
	        this.roomId = roomId;
	        this.roomType = roomType;
	        this.capacity = capacity;
	        this.price = price;
	        this.status = "Available";
	    }

	    public void setStatus(String status) {
			this.status = status;
		}

		public int getRoomId() {
	        return roomId;
	    }

	    public String getRoomType() {
	        return roomType;
	    }

	    public int getCapacity() {
	        return capacity;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getStatus() {
	        return status;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Room room = (Room) o;
	        return roomId == room.roomId;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(roomId);
	    }
}