package com.demo.beans;

public class MeetingRoom extends Room {
	private String tv_make;
	private String tv_model;
	public MeetingRoom() {
		super();
	}
	public MeetingRoom(int capacity, double price,String tv_make, String tv_model) {
		super("Meeting",capacity,price,true);
		this.tv_make = tv_make;
		this.tv_model = tv_model;
	}
	public String getTv_make() {
		return tv_make;
	}
	public void setTv_make(String tv_make) {
		this.tv_make = tv_make;
	}
	public String getTv_model() {
		return tv_model;
	}
	public void setTv_model(String tv_model) {
		this.tv_model = tv_model;
	}
	@Override
	public String toString() {
		return super.toString()+"MeetingRoom [tv_make=" + tv_make + ", tv_model=" + tv_model + "]";
	}
	
	
}
