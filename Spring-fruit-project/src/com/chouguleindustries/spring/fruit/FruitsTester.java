package com.chouguleindustries.spring.fruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitsTester {

	public static void main(String[] args) {
		String beanConfigurationPath = "applicationContext.xml";

		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationPath);

		Fruits fruits = container.getBean(Fruits.class);
		System.out.println(fruits.color);
		System.out.println(fruits.name);
		System.out.println(fruits.price);
		System.out.println(fruits.taste);

		fruits.cut();

		System.out.println(fruits.vitamine.isFatSolvable);
		System.out.println(fruits.vitamine.isWaterSoluble);
		System.out.println(fruits.vitamine.type);

	}

}
