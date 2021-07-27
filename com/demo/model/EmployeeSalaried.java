package com.demo.model;

public class EmployeeSalaried extends Employee{
	
	private double basicSal;
	private double bonus;
	private double totalSal;
   
   public EmployeeSalaried(String name,String mobNo,String email, String designation, String dept,String date,double basicSal)
   {
       super(name,mobNo,email,designation,dept,date);
       this.basicSal=basicSal;
      
	   
       this.totalSal=calculateSal(this.basicSal);
    
   }
   
public double calculateSal(double bsal){
	return (bsal + bsal*0.1 + bsal*0.15 + bsal*0.12);
}

public double getBasicSal() {
	return basicSal;
}

public void setBasicSal(double basicSal) {
	this.basicSal = basicSal;
}

public double getBonus() {
	return bonus;
}

public void setBonus(double bonus) {
	this.bonus = bonus;
}

public double getTotalSal() {
	return totalSal;
}

public void setTotalSal(double totalSal) {
	this.totalSal = totalSal;
}
   
@Override
public String toString() {
	
	return super.toString()+"\nBasic salary="+basicSal+"\nTotal Salary="+totalSal;
}

}
