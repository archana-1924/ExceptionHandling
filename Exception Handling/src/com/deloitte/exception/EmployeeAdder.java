package com.deloitte.exception;

public class EmployeeAdder {

	public void addEmployee(Employee emp) throws Exception
	{
		if(emp.getEmpId()<10000 || emp.getEmpId() >99999)
		{
			throw new InvalidEmployeeIdException("Invalid Employee ID");
		}
		if(emp.getEmpName().length()<3)
		{
			throw new InvalidEmployeeNameException("Invalid Name");
		}
		if(emp.getSalary()<30000 || emp.getSalary()>80000)
		{
			throw new InvalidEmployeeSalaryException("Wrong salary");
		}
		System.out.println("Added Successfully");
	}
}
