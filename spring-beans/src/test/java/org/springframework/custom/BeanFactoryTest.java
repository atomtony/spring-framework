package org.springframework.custom;


import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		DefaultListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

		MyTestBean bean= (MyTestBean) bf.getBean("myTestBean");

		System.out.println(bean.getTestStr());


	}
}
