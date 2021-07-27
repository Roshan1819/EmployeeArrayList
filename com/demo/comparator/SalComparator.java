package com.demo.comparator;

import java.util.Comparator;

import com.demo.model.Employee;
import com.demo.model.EmployeeSalaried;

public class SalComparator implements Comparator<Employee> {


	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(((EmployeeSalaried)o1).getTotalSal()<(((EmployeeSalaried)o2).getTotalSal())) {
			return -1;
		}
		else if(((EmployeeSalaried)o1).getTotalSal()==(((EmployeeSalaried)o2).getTotalSal())) {
			return 0;
		}
		
		return 1;
	}

}
