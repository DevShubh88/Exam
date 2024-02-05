package com.demo.dao;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.FourWheerler;
import com.demo.beans.TwoWheeler;
import com.demo.beans.Vehical;

public class VehicalDaoImpl implements VehicalDao{
	
	static Set <Vehical> ts;
	
	static {
		
		ts = new TreeSet<>();
		
		ts.add(new TwoWheeler(101,"Virat",LocalDate.of(2000, 10, 13), "electrical","kohli", "suzuki","honda", 24325, "avai",10));
		
	}

	@Override
	public void addNewVehical(Vehical v) {
		
		ts.add(v);
		
		
	}

	@Override
	public Vehical serchByMake(String make) {
		
		for(Vehical v: ts)
		{
			if(v.getMake().equals(make))
			{
				return v;
			}
		}
		return null;
	}

	@Override
	public Set<Vehical> bookVehical(double pr, int ch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Vehical> display() {
		// TODO Auto-generated method stub
		return ts;
	}
	
}
