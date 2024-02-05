package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.FourWheerler;
import com.demo.beans.TwoWheeler;
import com.demo.beans.Vehical;
import com.demo.dao.VehicalDao;
import com.demo.dao.VehicalDaoImpl;

public class VehicalServiceImpl implements VehicalService {
	VehicalDao vdao ;
	public VehicalServiceImpl()
	{
	  vdao= new VehicalDaoImpl();
	}
	@Override
	public void addNewVehical(int ch) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Vehical ID");
		int vid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Owner Name");
		String oname = sc.nextLine();
		System.out.println("enter date of Manufacture in (dd/MM/yyyy) Format");
		String dt=sc.nextLine();
		LocalDate mdt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter Type Of Vehical  \n1. Electric 2.NonElectric");
		String vtype = sc.nextLine();
		System.out.println("Enter Name Salesman");
		String sname = sc.nextLine();
		System.out.println("Enter Manufacturer Of Vehical");
		String make = sc.nextLine();
		System.out.println("Enter Model Of Vehical");
		String model = sc.nextLine();
		System.out.println("Enter Price Vehical");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Status Of Vehical \n 1. Avilable 2.NotAvilable");
		String s = sc.nextLine();
		
		Vehical v=null;
		
		switch(ch)
		{
		case 1:
			
			System.out.println("Enter Dicky Capasity of Two Wheeler ");
			int dc = sc.nextInt();
			v=new TwoWheeler(vid, oname, mdt, vtype, sname, make, model, price, s,dc);
			break;
	
		case 2:
			System.out.println("Enter Type Of Engine For FourWheeler \n1. Hybrid  2. Gear");
			String etype = sc.nextLine();
			System.out.println("Enter Type Of Engine For FourWheeler \n1. Auto  2. Manual");
			String gtype = sc.nextLine();
			v=new FourWheerler(vid,oname,mdt,vtype,sname,make,model,price,s,etype,gtype);
			break;	
		}
		
		vdao.addNewVehical(v);
		
	}

	@Override
	public Vehical serchByMake(String make) {
		
		return vdao.serchByMake(make);
	}

	@Override
	public Set<Vehical> bookVehical(double pr, int ch) {
		
		return vdao.bookVehical( pr,ch);
	}
	@Override
	public Set<Vehical> display() {
		// TODO Auto-generated method stub
		return vdao.display();
	}
	
	
}
