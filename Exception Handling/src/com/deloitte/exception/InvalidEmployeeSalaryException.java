package com.deloitte.exception;

@SuppressWarnings("serial")
public class InvalidEmployeeSalaryException extends RuntimeException{
	public InvalidEmployeeSalaryException(String message)
	{
		super(message);
	}
}
