package com.exception;

public class OverLimit extends Exception{
	String message;
	
	public OverLimit(String message) {
		super();
		this.message = message;
	}

	public String toString() {
		return message;
	}
}
