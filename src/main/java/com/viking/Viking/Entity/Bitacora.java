package com.viking.Viking.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Bitacora {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String model;
	private double price;
	private int year;
	private int tyre;
	private int engine;
	private int cylinder;
	private String owner;
	
	public Bitacora(int id, double price, int year, int tyre, int engine, int cylinder, String owner, String model) {
		this.id = id;
		this.price = price;
		this.year = year;
		this.tyre = tyre;
		this.engine = engine;
		this.cylinder = cylinder;
		this.owner = owner;
		this.model = model;
	}


	
	public Bitacora() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTyre() {
		return tyre;
	}

	public void setTyre(int tyre) {
		this.tyre = tyre;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}


	
	

}
