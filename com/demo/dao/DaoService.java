package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface DaoService {
	
	
	void addEmployee(Employee emp);
	
	List<Employee> display();

	Employee searchById(int i);

	Employee searchByName(String name);

	List<Employee> sortByName();

	boolean updateMob(int i, String mo);

	boolean delete(int i);

	

//	List<Employee> sortBySal();

	

}
