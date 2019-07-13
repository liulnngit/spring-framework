package com.study.jesse.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyElement {
	
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("application.xml");
		User user = (User)bf.getBean("testBean");
		System.out.println(user.getUserName()+","+user.getEmail());
	}
}
