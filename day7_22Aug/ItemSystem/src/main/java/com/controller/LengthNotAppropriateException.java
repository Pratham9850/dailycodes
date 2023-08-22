package com.controller;

public class LengthNotAppropriateException extends RuntimeException {

	private String message;
	public LengthNotAppropriateException(String message)
	{
		this.message=message;
	}
	public String toString()
	{
		return "error-->"+message;
	}
}
