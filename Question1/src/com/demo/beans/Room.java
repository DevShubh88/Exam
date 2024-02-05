package com.demo.beans;

public class Room {
	private int roomid;
	private String roomname;
	private int capacity;
	private double price;
	private boolean status;
	public static int n;
	static {
		n = 1;
	}
	public Room() {
		super();
		this.roomid = n;
	}
	public Room(String roomname, int capacity, double price, boolean status) {
		super();
		this.roomname = roomname;
		this.capacity = capacity;
		this.price = price;
		this.status = status;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid() {
		this.roomid = (int)Math.floor(Math.abs(Math.random() * 100));
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Room [roomid=" + roomid + ", roomname=" + roomname + ", capacity=" + capacity + ", price=" + price
				+ ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return n;
	}
	@Override
	public boolean equals(Object o) {
		return this.roomid == ((Room)o).roomid;
	}
	
}
