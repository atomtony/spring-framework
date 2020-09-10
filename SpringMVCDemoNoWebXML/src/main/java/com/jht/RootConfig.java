package com.jht;


import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.jht"},
        excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)}
)
@ImportResource(locations = {"classpath:spring-person.xml"})
public class RootConfig {

    @Bean
    public Person create(){
        return new Person();
    }

}
