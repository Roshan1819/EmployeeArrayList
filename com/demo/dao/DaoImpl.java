package com.demo.dao;

import com.demo.comparator.NameComparator;
import com.demo.comparator.SalComparator;
import com.demo.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DaoImpl implements DaoService{
    static List<Employee> lemp = new ArrayList <>();

	@Override
	public void addEmployee(Employee emp) {
		lemp.add(emp);
		
	}

	@Override
	public List<Employee> display() {
		return lemp;
		
		
	}

	@Override
	public Employee searchById(int i) {
		
		Employee e = new Employee(i);
		int ind=lemp.indexOf(e);
        if(ind!=-1)
            return lemp.get(ind);
        else
		    return null;
	}

	@Override
	public Employee searchByName(String name) {
		
		for(Employee e: lemp) {
			
			if(e.getName().equals(name)) {
				return e;
			}
		}
		
		return null;
	}

	@Override
	public List<Employee> sortByName() {
		
		Collections.sort(lemp, new NameComparator());
		return lemp;
	}

	@Override
	public boolean updateMob(int i, String mo) {
		if(searchById(i) != null) {
			searchById(i).setMobNo(mo);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int i) {
		Employee o = new Employee(i);
		if(lemp.indexOf(o)!=-1) {
			
			lemp.remove(lemp.indexOf(o));
			return true;
		}
		return false;
	}

//	@Override
//	public List<Employee> sortBySal() {
//		
//		Collections.sort(lemp, new SalComparator());
//		return lemp;
//	}

   



}
