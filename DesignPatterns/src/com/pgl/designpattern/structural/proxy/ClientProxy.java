package com.pgl.designpattern.structural.proxy;

public class ClientProxy {

	public static void main(String[] args) {
		//The client calls only the proxy to call the real subject methods :
		Subject subject = new ProxySubject();
		subject.request();
	}

}
