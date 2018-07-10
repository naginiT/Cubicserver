package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("resource/spring.xml");
		car c=(car)app.getBean("c");
		System.out.println(c.getCarname());
		System.out.println(c.getEngine().getModelyear());
		System.out.println(c.getEngine1().getCc());
	}

}
