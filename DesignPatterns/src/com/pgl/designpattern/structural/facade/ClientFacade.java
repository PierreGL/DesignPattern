package com.pgl.designpattern.structural.facade;

public class ClientFacade {

	public static void main(String[] args) {
		//The client use only facade, not element of sub-system.
		Facade facade = new Facade();
		facade.action1();
	}

}
