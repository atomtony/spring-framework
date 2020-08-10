package org.springframework.emp;


import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.io.ClassPathResource;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class EmpTest2 {

	@Test
	public void testSimpleLoad() {
		ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
		Department bean = (Department) context.getBean("department");
		Emp beanEmp = (Emp) context.getBean("emp");
		System.out.println(beanEmp.getDepartment().getName());

		// 国际化测试失败
		System.out.println(context.getMessage("test", null, Locale.US));
		System.out.println(context.getMessage("test", null, Locale.SIMPLIFIED_CHINESE));

		context.publishEvent(new TestEvent("aaa"));

		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new String2DateConverter());
		Date date = conversionService.convert("1988-04-23 11:11::11", Date.class);

		System.out.println(date.toLocaleString());

	}

	static class TestEvent extends ApplicationEvent {


		public TestEvent(Object source) {
			super(source);
		}

		public void print() {
			System.out.println(source);
		}
	}
}
