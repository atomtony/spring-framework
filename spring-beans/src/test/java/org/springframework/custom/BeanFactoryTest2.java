package org.springframework.custom;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest2 {

	@Test
	public void testSimpleLoad() {
		DefaultListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest2.xml"));
		MyTestBean2 bean= (MyTestBean2) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());
	}
}
