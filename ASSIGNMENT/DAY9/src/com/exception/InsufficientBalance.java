package com.exception;

public class InsufficientBalance extends Exception {
	String message;
	
	public InsufficientBalance(String message) {
		super();
		this.message = message;
	}

	public String toString() {
		return message;
	}
}
