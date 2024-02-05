package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Room;
import com.demo.service.RoomService;
import com.demo.service.RoomServiceImpl;

public class TestRoom {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		RoomService rservice = new RoomServiceImpl();
		
		do {
			System.out.println("1. Add new Room\n2. Cancel Room booking\n3. Book a room\n4. close\nEnter choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("1. Meeting room\n2. Training room");
				int ch = sc.nextInt();
				rservice.addNewRoom(ch);
				break;
				
			case 2:
				System.out.println("Enter roomid to cancel ");
				int id = sc.nextInt();
				rservice.cancelRoom(id);
				break;
			case 3:
				System.out.println("Enter type of room:");
				String rtype = sc.next();
				System.out.println("Enter the capacity: ");
				int cap = sc.nextInt();
				Room r = rservice.bookRoom(rtype,cap);
				if(r != null) {
					System.out.println(r);
				} else {
					System.out.println("Room not available");
				}
				
				break;
			case 4:
				sc.close();
				System.out.println("Thank you for visiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
			
			
		}while(choice != 4);
		

	}

}
