package org.springframework.custom;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest1 {

	@Test
	public void testSimpleLoad() {
		DefaultListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest1.xml"));
		bf.addBeanPostProcessor(bf.getBean(FullyBeanPostProcessor.class));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());

	}
}
