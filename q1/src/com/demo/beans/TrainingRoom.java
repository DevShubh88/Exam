package com.demo.beans;

public class TrainingRoom extends Room {
    private String telephoneNumber;


    public TrainingRoom(int roomId, String roomType, int capacity, double price, String telephoneNumber) {
        super(roomId, roomType, capacity, price);
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}