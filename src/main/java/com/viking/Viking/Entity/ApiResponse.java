package com.viking.Viking.Entity;

import java.io.Serializable;

public class ApiResponse<T> implements Serializable {
	
	private int status;
	private String message;
	private Object restul;
	
	
	public ApiResponse(int status, String message, Object restul) {
		this.status = status;
		this.message = message;
		this.restul = restul;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getRestul() {
		return restul;
	}
	public void setRestul(Object restul) {
		this.restul = restul;
	}


	
	

}
