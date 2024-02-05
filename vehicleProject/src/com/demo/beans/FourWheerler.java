package com.demo.beans;

import java.time.LocalDate;

public class FourWheerler extends Vehical{
	
	private String etype;
	private String gtype;
	
	public FourWheerler() {
		super();
	}

	
	public FourWheerler(int vid, String oname, LocalDate mdt, String vtype, String sname, String make, String model,
			int price, String status, String etype, String gtype) {
		super(vid, oname, mdt, vtype, sname, make, model, price, status);
		this.etype = etype;
		this.gtype = gtype;
	}


	public String getEtype() {
		return etype;
	}

	public void setEtype(String etype) {
		this.etype = etype;
	}

	public String getGtype() {
		return gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	@Override
	public String toString() {
		return super.toString()+"FourWheerler [etype=" + etype + ", gtype=" + gtype + "]";
	}
	
	

}
