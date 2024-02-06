package com.demo.beans;

public class MeetingRoom extends Room {
    private String tvMake;
    private String tvModel;

   

    public MeetingRoom(int roomId, String roomType, int capacity, double price, String tvMake, String tvModel) {
        super(roomId, roomType, capacity, price);
        this.tvMake = tvMake;
        this.tvModel = tvModel;
    }

    public String getTvMake() {
        return tvMake;
    }

    public String getTvModel() {
        return tvModel;
    }
}