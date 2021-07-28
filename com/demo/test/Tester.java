package com.demo.test;

import java.util.Scanner;

import com.demo.service.*;
public class Tester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService empl = new EmployeeImpl();
		
		int choice;
		do
		{
			System.out.println("1.Add Employee \n2.Display all employees \n3.Search employee by id  \n4.Serach employee by name \n5.Update employees mobile number \n6.Delete employee \n7.Sort employee by name \n8.Exit \nEnter your choice");
			choice = sc.nextInt();
			
			switch(choice){
			  
			case 1:
				empl.addEmployee();
				break;
				
			case 2:
				empl.display();
				break;
			case 3:
				System.out.println("Enter Employee id :");
				int id =sc.nextInt();
				empl.searchById(id);
				break;
			case 4:
				
				System.out.println("Enter Employee Name :");
				String nm =sc.next();
				empl.searchByName(nm);
				break;
			case 5:
				System.out.println("Enter Employee id :");
				id =sc.nextInt();
				System.out.println("Enter Employee mobile number :");
				String mob =sc.next();
				empl.updateMob(id, mob);
				break;
			case 6:
				System.out.println("Enter Employee id :");
				id =sc.nextInt();
				empl.delete(id);
				break;
			case 7:
				empl.sortByName();
				break;
			
			case 8:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice !");
				break;
				
			}
		}while(choice != 8);
		
	}

}
