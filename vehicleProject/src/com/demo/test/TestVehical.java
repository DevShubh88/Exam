package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Vehical;
import com.demo.service.VehicalService;
import com.demo.service.VehicalServiceImpl;

public class TestVehical {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		VehicalService vser = new VehicalServiceImpl();
		int choice;
		do {
			
			System.out.println("1. Add New Vehical  2. Search Vehical By Model  3. Book Vehical 4:display all");
			
			choice = sc.nextInt();
			switch(choice)
		{
		
		case 1:
			System.out.println("Select Vehical Type \n 1. Two Wheeler  2.Four Wheeler");
			int ch = sc.nextInt();
			vser.addNewVehical(ch);
			break;
			
		case 2:
			System.out.println("Enter Manufacturer Of Vehical ");
			String make = sc.next();
			Vehical v =vser.serchByMake(make);
			if(v!= null)
			{
				System.out.println(v);
			}
			else
			{
				System.out.println("Not Found");
			}
			break;
			
		case 3:
		
			System.out.println("Enter Price Of Vehical ");
			double pr = sc.nextDouble();
			System.out.println("Select Vehical Type \n 1. Two Wheeler  2.Four Wheeler");
			ch = sc.nextInt();
			Set <Vehical> vset= vser.bookVehical(pr,ch);
			
			if(vset!= null)
			{
				vset.stream().forEach(System.out::println);
			}
			else
			{
				System.out.println("Not Found");
			}
			break;
			
		case 4:
			Set<Vehical> vs=vser.display();
			
			if(vs!= null)
			{
				vs.stream().forEach(System.out::println);
			}
			else
			{
				System.out.println("Not Found");
			}
			break;	
		case 5:
			break;
		default :
			System.out.println("Wrong Choice....!!!");
			break;
		}
		}while(choice!=0);

	}

}
