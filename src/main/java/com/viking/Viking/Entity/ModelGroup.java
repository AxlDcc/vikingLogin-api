package com.viking.Viking.Entity;

public class ModelGroup {
	private int id;
	private long countModel;
	private String nameModel;
	
	public ModelGroup(int id,long countModel, String nameModel) {
		this.id = id;
		this.countModel = countModel;
		this.nameModel = nameModel;
	}
	public ModelGroup() {}
	
	public long getCountModel() {
		return countModel;
	}
	public void setCountModel(long countModel) {
		this.countModel = countModel;
	}
	public String getNameModel() {
		return nameModel;
	}
	public void setNameModel(String nameModel) {
		this.nameModel = nameModel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
