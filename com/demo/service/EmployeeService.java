package com.demo.service;

import com.demo.model.Employee;

public interface EmployeeService {
	
	 void addEmployee();
	 void display();
	void searchById(int i);
	void searchByName(String name);
	
	void sortByName();
	//void sortBySal();
	void updateMob(int i, String mo);
	void delete(int i);
	

}
