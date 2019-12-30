package com.deloitte.exception;

public class EmployeeManagement {

	public static void main(String[] args) {
		Employee emp= new Employee(10005,"Mahesh",50000);
		EmployeeAdder empAdd= new EmployeeAdder();
		try
		{
			empAdd.addEmployee(emp);
		}
		catch(Exception e)
		{
			System.out.println("Error - "+e.getMessage());
		}
	}

}
