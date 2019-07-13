package com.study.jesse.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport{

	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}

}
