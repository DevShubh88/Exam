package com.demo.beans;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	QueueList obj = new QueueList();
				
	int ch;
	do {
		System.out.println("0. exit");
		System.out.println("1. Inert: ");
		System.out.println("2. Remove");
		System.out.println("3. display: ");
		System.out.println("4. Only Female: ");
		System.out.println("5. only Male: ");
		System.out.println("6. Queue Recursion: ");
		System.out.println("7. Display In reverse: ");
		System.out.println("Enter choice : ");
		ch = sc.nextInt();
		
		switch(ch) {
		
		case 0:System.exit(0);
			break;
			
		case 1:	
			System.out.println("Enter id : ");
			int emp_id = sc.nextInt();
			
			System.out.println("Enter Name");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Enter gender(M/F)");
			String gen = sc.next();
			
			Employee emp = new Employee(emp_id, name, gen);
			obj.addEmployee(emp);
			break;
			
		case 2:
			obj.removeEmp();
			break;
			
			
		case 3:
			System.out.println(obj.toString());
			break;
			
		case 4:
				System.out.println("List of Female : ");
				obj.femaleEmp();
			break;
			
			
		case 5:
			System.out.println("List of Male : ");
			obj.maleEmp();
			break;
			
			
		case 6:
			obj.recursion();
			break;
		
		case 7:
			obj.reverse();
			break;
		default:System.out.println("Enter valid choice : ");
		
		}
		
		}while(ch!=0);
	}

}

	


