package org.springframework.emp;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;
import java.util.Locale;

public class EmpTest3 {

	@Test
	public void testSimpleLoad() {
		ApplicationContext context = new ClassPathXmlApplicationContext("emp3.xml");
		People beanEmp = (People) context.getBean("emp3");
		beanEmp.test();

	}


}
