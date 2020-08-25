package org.springframework.jdbc.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringJDBCTest {
	@Test
	public void testSimpleLoad() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
		UserService userService = (UserService) context.getBean("userService");

		User user = new User();
		user.setName("張三");
		user.setAge(20);
		user.setSex("男");

		userService.save(user);

		List<User> users = userService.getUsers();
		System.out.println(users);

		System.out.println(userService.queryForObject());


	}
}
