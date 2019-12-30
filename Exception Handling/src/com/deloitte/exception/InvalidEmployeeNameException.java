package com.deloitte.exception;

@SuppressWarnings("serial")
public class InvalidEmployeeNameException extends RuntimeException{
	public InvalidEmployeeNameException(String message)
	{
		super(message);
	}
}
