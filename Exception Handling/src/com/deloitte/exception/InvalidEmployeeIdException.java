package com.deloitte.exception;

@SuppressWarnings("serial")
public class InvalidEmployeeIdException extends RuntimeException{
	public InvalidEmployeeIdException(String message)
	{
		super(message);
	}
}
