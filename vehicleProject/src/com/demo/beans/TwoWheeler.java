package com.demo.beans;

import java.time.LocalDate;

public class TwoWheeler extends Vehical{
	
	private int dcapacity;

	public TwoWheeler() {
		super();
	}

	

	public TwoWheeler(int vid, String oname, LocalDate mdt, String vtype, String sname, String make, String model,
			int price, String status, int dcapacity) {
		super(vid, oname, mdt, vtype, sname, make, model, price, status);
		this.dcapacity = dcapacity;
	}



	public int getDcapacity() {
		return dcapacity;
	}

	public void setDcapacity(int dcapacity) {
		this.dcapacity = dcapacity;
	}

	@Override
	public String toString() {
		return super.toString()+ "TwoWheeler [dcapacity=" + dcapacity + "]";
	}
	
	

}
