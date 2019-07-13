package com.study.jesse.spring.service;

import org.springframework.stereotype.Component;

@Component
public class Bbean {

	public void sayHello() {
		System.out.println(this + " 大哥，进来玩会！");
	}
}
