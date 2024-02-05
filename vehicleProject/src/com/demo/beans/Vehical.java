package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;


public class Vehical implements Comparable<Vehical> {
	
	private int vid;
	private String oname;
	private LocalDate mdt;
	private String vtype ;
	private String sname;
	private String make;
	private String model;
	private double price;
	private String status;
	
public Vehical() {
		super();
		
	}

public Vehical(int vid, String oname, LocalDate mdt, String vtype, String sname, String make, String model, int price, String status) {
	super();
	this.vid = vid;
	this.oname = oname;
	this.mdt = mdt;
	this.vtype = vtype;
	this.sname = sname;
	this.make = make;
	this.model = model;
	this.price = price;
	this.status = status;

}


public int getVid() {
	return vid;
}


public void setVid(int vid) {
	this.vid = vid;
}


public String getOname() {
	return oname;
}


public void setOname(String oname) {
	this.oname = oname;
}


public LocalDate getMdt() {
	return mdt;
}


public void setMdt(LocalDate mdt) {
	this.mdt = mdt;
}


public String getVtype() {
	return vtype;
}


public void setVtype(String vtype) {
	this.vtype = vtype;
}


public String getSname() {
	return sname;
}


public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public void setSname(String sname) {
	this.sname = sname;
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}

@Override
public String toString() {
	return "Vehical [vid=" + vid + ", oname=" + oname + ", mdt=" + mdt + ", vtype=" + vtype + ", sname=" + sname
			+ ", make=" + make + ", model=" + model + ", price=" + price + ", status=" + status + "]";
}

@Override
public int hashCode() {
	return vid;
}

@Override
public boolean equals(Object obj) {
	
	return this.vid==((Vehical)obj).vid;
}



@Override
public int compareTo(Vehical o) {
	// TODO Auto-generated method stub
	return this.oname.compareTo(((Vehical)o).getOname());
}
}
















































































