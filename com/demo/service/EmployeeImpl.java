package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.DaoImpl;
import com.demo.dao.DaoService;
import com.demo.model.Employee;
import com.demo.model.EmployeeContract;
import com.demo.model.EmployeeSalaried;
import com.demo.model.Person;

public class EmployeeImpl implements EmployeeService{
	 static Scanner sc = new Scanner(System.in);
	 private DaoService dao;
	 public EmployeeImpl() {
		 this.dao = new DaoImpl();
	 }
	 
	@Override
	public void addEmployee() {
		System.out.println("Enter name : ");
    	String name = sc.next();
    	
    	System.out.println("Enter Mob : ");
    	String mob = sc.next();
    	
    	System.out.println("Enter email : ");
    	String email = sc.next();
    	
    	System.out.println("Enter Designation : ");
    	String designation = sc.next();
    	
    	System.out.println("Enter Department : ");
    	String dept = sc.next();
    	
    	System.out.println("Enter Join date : ");
    	String date = sc.next();
    	
    	System.out.println("Enter Salary : ");
    	double salary = sc.nextDouble();
		
    	dao.addEmployee(new EmployeeSalaried(name, mob, email, designation, dept, date, salary));
    	//dao.addEmployee(new EmployeeContract(name, mob, email, designation, dept, date, 2, 200));
    	
	}

	@Override
	public void display() {
		
		List<Employee> lemp = dao.display();
		
		if(lemp != null) {
			
			for(Employee emp:lemp) {
				System.out.println(emp);
			}
		}
		else
			System.out.println("List is empty");
		
	}

	@Override
	public void searchById(int i) {
		Employee emp = dao.searchById(i);
		
		System.out.println(emp);
	}

	@Override
	public void searchByName(String name) {
		
		Employee emp = dao.searchByName(name);
		System.out.println(emp);
	}

	@Override
	public void sortByName() {
		List<Employee> emp = dao.sortByName();
		
		if(emp != null) {
			
			emp.stream().forEach(e->{System.out.println(e);});
		}
		
	}

	@Override
	public void updateMob(int i, String mo) {
		boolean flag = dao.updateMob(i, mo);
		if(flag) {
			System.out.println("Updated ");
		}
		else
			System.out.println("Not found");
		
	}

	@Override
	public void delete(int i) {
		boolean flag = dao.delete(i);
		
		if(flag) {
			System.out.println("Deleted ");
		}
		else
			System.out.println("Not found");
		
	
	}

//	@Override
//	public void sortBySal() {
//		List<Employee> emp = dao.sortBySal();
//			
//			if(emp != null) {
//				
//				emp.stream().forEach(e->{System.out.println(e);});
//			}
//		
//	}
//	

	


	
	
    
}
