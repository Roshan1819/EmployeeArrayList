package com.demo.model;

public class Employee extends Person {
	private String designation;
	private String dept;
	private String date;
	
	public Employee(String name,String mobNo,String email, String designation, String dept,String date)
	{
		super(name,mobNo,email);
		this.designation=designation;
		this.dept=dept;
		this.date=date;
	}

	public Employee(int id)
	{
		super(id);
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	
	 
	@Override
	public String toString() {
		
		return super.toString()+ "\nDesignation=" + designation + "\nDepartment=" + dept +"\nDate of Joining="+date;
	}

}
