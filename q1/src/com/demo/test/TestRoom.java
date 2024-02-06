package com.demo.test;

import java.util.HashSet;
import java.util.Scanner;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;
import com.demo.beans.TrainingRoom;
import com.demo.service.RoomService;
import com.demo.service.RoomServiceImpl;
import com.demo.dao.*;

public class TestRoom {
	public static void main(String[] args) {
        RoomDao roomDao = new RoomDaoImpl();
        RoomService roomService = new RoomServiceImpl(roomDao);
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Add new room (MeetingRoom)");
            System.out.println("2. Add new room (TrainingRoom)");
            System.out.println("3. Cancel room booking");
            System.out.println("4. Book a room");
            System.out.println("5. Show all rooms");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    roomService.addNewRoom(choice, scanner);
                    break;
                case 3:
                    System.out.println("Enter room ID to cancel booking:");
                    int cancelRoomId = scanner.nextInt();
                    roomService.cancelRoomBooking(cancelRoomId);
                    break;
                case 4:
                    System.out.println("Enter room ID to book:");
                    int bookRoomId = scanner.nextInt();
                    roomService.bookRoom(bookRoomId);
                    break;
                case 5:
                    roomService.showAllRooms();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        scanner.close();
    }
}