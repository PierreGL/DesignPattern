package com.pgl.designpattern.structural.proxy;

public class ProxySubject implements Subject {

	@Override
	public void request() {
		
		//Creation of real subject if necessary :
		RealSubject realSubject = new RealSubject();
		//Call the matching method of real subject :
		realSubject.request();
	}

}
