package org.springframework.rmi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIServerTest {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("RMIServer.xml");
	}

}
