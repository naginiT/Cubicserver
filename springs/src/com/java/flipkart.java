package com.java;

public class flipkart {
	
	private courier courier;

	public courier getCourier() {
		return courier;
	}
public flipkart(courier courier){
	this.courier=courier;
}
	
	public void purchase(){
		
		int orderid=1258;
		System.out.println(courier.deliver(orderid));
		
	}
	
	

}
