package com.java;

public class car {
	
	private String carname;
	private engine engine;
	private engine1 engine1;
	
	public engine1 getEngine1() {
		return engine1;
	}

	public String getCarname() {
		return carname;
	}
	
	public engine getEngine() {
		return engine;
	}

	public car(String carname, com.java.engine engine,com.java.engine1 engine1) {
		super();
		this.carname = carname;
		this.engine = engine;
		this.engine1=engine1;
	}
		
	
	
	
	

}
