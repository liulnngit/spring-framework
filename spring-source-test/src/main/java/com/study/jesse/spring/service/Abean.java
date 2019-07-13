package com.study.jesse.spring.service;

import javax.annotation.PostConstruct;

import com.study.jesse.spring.ext.MyComponentAnno;

//@Component
@MyComponentAnno
public class Abean {
	
	public Abean(){
		System.out.println("初始化...");
	}
	
	public void doSomething() {
		System.out.println(this + " do something .....");
	}
	
	/*@PostConstruct
	public void postConstructor(){
		System.out.println("postConstruct....");
	}*/
}
