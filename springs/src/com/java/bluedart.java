package com.java;

public class bluedart implements courier {

	@Override
	public String deliver(int orderid) {
		System.out.println("hi");
		// TODO Auto-generated method stub
		return "bluedart is ready to deliver:::"+orderid;
	}

}
