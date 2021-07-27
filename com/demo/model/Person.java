package com.demo.model;

abstract public class Person implements Comparable<Person>{
	static {
		
		count = 1;
	}
	private static int count; 
	private String name;
	private int id;
	private String mobNo;
	private String email;
	
	public Person(String name,String mobNo,String email) {
		this.id=count++;
		this.name=name;
		this.mobNo=mobNo;
		this.email=email;
	}
	
	public Person (int i)
	{
		this.id = i;
		this.name=null;
		this.mobNo=null;
		this.email=null;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(this.id == ((Person)obj).id){
			return true;
		}
		
		return false;
			
	}
	
	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.name);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	
	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nName=" + name + "\nID=" + id + "\nMobNo=" + mobNo + "\nEmail=" + email ;
	}

	

	
}
