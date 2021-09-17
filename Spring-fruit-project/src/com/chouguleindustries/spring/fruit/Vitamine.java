package com.chouguleindustries.spring.fruit;

public class Vitamine {
	

	public String type;
	public boolean isWaterSoluble;
	public boolean isFatSolvable;

	public Vitamine(String type, boolean isWaterSoluble, boolean isFatSolvable) {
		super();
		this.type = type;
		this.isWaterSoluble = isWaterSoluble;
		this.isFatSolvable = isFatSolvable;
	}

	public void eat() {
		System.out.println(" invoked eat");
	}
}
