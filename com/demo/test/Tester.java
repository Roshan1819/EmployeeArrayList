package com.demo.test;

import com.demo.service.*;
public class Tester {
	
	public static void main(String[] args) {
		
		EmployeeService empl = new EmployeeImpl();
		
		empl.addEmployee();
		empl.addEmployee();
		empl.addEmployee();
		
		//empl.searchById(1);
		//empl.searchByName("roshan");
		//empl.sortByName();
		//empl.sortBySal();
		//empl.display();
		
		empl.updateMob(3, "123456");
		empl.searchById(3);
		
		empl.delete(3);
		empl.display();
	}

}
