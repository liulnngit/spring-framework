package com.study.jesse.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.jesse.spring.ext.MyTypeFilter;

@Configuration
@ComponentScan(includeFilters={ @Filter(type=FilterType.CUSTOM,classes=MyTypeFilter.class) })
public class MyLearing {
	
	public static void main(String[] args) {
		
		// xml文件配置加载
		//ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		//注解方式，指定扫描包
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"com.study.jesse.spring.service");
		
		//测试BeanFactoryPostProcessor扩展
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"com.study.jesse.spring.service","com.study.jesse.spring.ext");*/
		
		context.close();
	}
	

}
