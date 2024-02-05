package com.demo.service;

import java.util.Scanner;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;
import com.demo.beans.TrainingRoom;
import com.demo.dao.RoomDao;
import com.demo.dao.RoomDaoImpl;

public class RoomServiceImpl implements RoomService {

	private RoomDao rdao;
	
	public RoomServiceImpl() {
		rdao = new RoomDaoImpl();
	}
	
	@Override
	public void addNewRoom(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter room capacity:");
		int cap = sc.nextInt();
		System.out.println("Enter room price:");
		double price = sc.nextDouble();
		Room r = null;
		switch(ch) {
		case 1:
			System.out.println("Enter TV make:");
			String tvmake = sc.next();
			System.out.println("Enter TV model:");
			String tvmodel = sc.next();
			r = new MeetingRoom(cap,price,tvmake,tvmodel);
			break;
		case 2:
			System.out.println("Enter Telephone number:");
			String tnum = sc.next();
			r = new TrainingRoom(cap,price,tnum);
			break;
		}
		
		rdao.save(r);
		
	}

	@Override
	public void cancelRoom(int id) {
		rdao.changeRoomStatus(id);
		
	}

	@Override
	public Room bookRoom(String rtype, int cap) {
		return rdao.bookRoom(rtype,cap);
		
	}

}
