package com.pgl.designpattern.structural.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("Make action.");
	}

}
