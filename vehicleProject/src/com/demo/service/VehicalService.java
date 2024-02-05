package com.demo.service;

import java.util.Set;

import com.demo.beans.Vehical;

public interface VehicalService {

	void addNewVehical(int ch);

	Vehical serchByMake(String make);

	Set<Vehical> bookVehical(double pr, int ch);

	Set<Vehical> display();

}
