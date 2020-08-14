package org.springframework.emp;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest4 {

	@Test
	public void testSimpleLoad() {
		ApplicationContext context = new ClassPathXmlApplicationContext("emp4.xml");
		Emp4 beanEmp = (Emp4) context.getBean("emp4");
		beanEmp.test();

	}


}
