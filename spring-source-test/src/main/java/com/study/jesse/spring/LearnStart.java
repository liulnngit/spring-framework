package com.study.jesse.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.jesse.spring.service.Abean;

public class LearnStart {
	
	public static void main(String[] args) {
		//注解方式，扫描指定的包
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"com.study.jesse.spring.service","com.study.jesse.spring.ext");
		Abean ab = context.getBean(Abean.class);
		ab.doSomething();
		context.close();
	}
}
