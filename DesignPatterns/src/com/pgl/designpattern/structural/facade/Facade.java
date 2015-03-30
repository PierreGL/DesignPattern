package com.pgl.designpattern.structural.facade;

public class Facade {

	private Class1 c1;
	private Class2 c2;
	
	public Facade(){
		c1 = new Class1();
		c2 = new Class2();
	}
	
	/**
	 * This simple action mask comlexity of multiple methods call with multiple class.
	 * */
	public void action1(){
		c1.operation1();
		c1.operation2();
		c2.operation2();
	}
}
