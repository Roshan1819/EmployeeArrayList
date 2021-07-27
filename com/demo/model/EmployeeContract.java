package com.demo.model;

public class EmployeeContract extends Employee {
    private int hrs;
    private int hrRate;

public EmployeeContract(String name, String mobNo, String email, String dept, String designation, String dt, int hrs, int rate){


       super(name,mobNo,email,designation,dept,dt);
       this.hrs=hrs;
       this.hrRate=rate;
}

    @Override
public String toString() {
	
	return super.toString()+"\nNumber of Hours Worked = "+hrs+"\nHourly Charges = " + hrRate;
}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getHrRate() {
		return hrRate;
	}

	public void setHrRate(int hrRate) {
		this.hrRate = hrRate;
	}

}