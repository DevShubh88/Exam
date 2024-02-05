package com.demo.dao;

import java.util.Set;

import com.demo.beans.Vehical;

public interface VehicalDao {

	void addNewVehical(Vehical v);

	Vehical serchByMake(String make);

	Set<Vehical> bookVehical(double pr, int ch);

	Set<Vehical> display();

}
