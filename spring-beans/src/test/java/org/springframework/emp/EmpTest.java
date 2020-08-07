package org.springframework.emp;


import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EmpTest {

	@Test
	public void testSimpleLoad() {
		DefaultListableBeanFactory bf = new XmlBeanFactory(new ClassPathResource("emp.xml"));
		bf.addBeanPostProcessor(bf.getBean(FullyBeanPostProcessor.class));
		Department bean= (Department) bf.getBean("department");
		Emp beanEmp= (Emp) bf.getBean("emp");
		System.out.println(beanEmp.getDepartment().getName());
		bf.destroySingleton("emp");
		bf.destroyBean(beanEmp);
	}
}
