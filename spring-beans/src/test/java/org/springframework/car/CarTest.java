package org.springframework.car;


import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.custom.MyTestBean;

public class CarTest {

	@Test
	public void testSimpleLoad() throws Exception {
		DefaultListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("car.xml"));
		Car bean= (Car) bf.getBean("mycar");
		System.out.printf(bean.toString());
	}
}
