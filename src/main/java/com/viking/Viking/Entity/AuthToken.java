package com.viking.Viking.Entity;

public class AuthToken {
	
	private String token;
	private String name;
	private String rol;

	public AuthToken(String token, String name, String rol) {
		this.token = token;
		this.name = name;
		this.rol = rol;
	}
	public AuthToken() {
		
	}
	public AuthToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getName() {
		return name;
	}
	public void setName(String username) {
		this.name = username;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

	
	
}
