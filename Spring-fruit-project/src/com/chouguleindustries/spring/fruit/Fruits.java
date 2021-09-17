package com.chouguleindustries.spring.fruit;

public class Fruits {

	public String name;
	public String color;
	public float price;
	public String taste;
	public Vitamine vitamine;

	public Fruits(String name, String color, float price, String taste, Vitamine vitamine) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.taste = taste;
		this.vitamine = vitamine;
	}

	public void cut() {
		System.out.println(" invoked cut");
		vitamine.eat();
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", price=" + price + ", taste=" + taste + ", vitamine="
				+ vitamine + "]";
	}

}
