package com.mango.exception;

public class OAException extends Exception {
	private String message;
	
	

	public OAException(String message) {
		super(message);
		this.message = message;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "OAException [message=" + message + "]";
	}
	
	
	
}
