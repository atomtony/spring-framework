package com.jht;


import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.jht"},
		excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)}
)
@ImportResource(locations = {"classpath:spring-person.xml"})
@Import(value = {Man.class})
public class RootConfig {

	@Bean()
	public Person create() {
		return new Person();
	}
	@Bean
	public static Person create2() {
		return new Person();
	}
}
