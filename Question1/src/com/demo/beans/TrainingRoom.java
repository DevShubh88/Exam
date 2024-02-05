package com.demo.beans;

public class TrainingRoom extends Room{
	private String telphoneNumber;

	public TrainingRoom() {
		super();
	}

	public TrainingRoom(int capacity, double price,String telphoneNumber) {
		super("Training",capacity,price,true);
		this.telphoneNumber = telphoneNumber;
	}

	public String getTelphoneNumber() {
		return telphoneNumber;
	}

	public void setTelphoneNumber(String telphoneNumber) {
		this.telphoneNumber = telphoneNumber;
	}

	@Override
	public String toString() {
		return super.toString()+"TrainingRoom [telphoneNumber=" + telphoneNumber + "]";
	}
	
	
	
}
