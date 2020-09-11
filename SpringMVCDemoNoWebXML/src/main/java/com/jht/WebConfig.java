package com.jht;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
// 如果配置了@EnableWebMvc，那么加载的是系统的DelegatingWebMvcConfiguration，当前一些方法覆盖不生效
// 如果不配置@EnableWebMvc，那么当前类覆盖父类方法生效
//@EnableWebMvc
//启动组件扫描
@ComponentScan("com.jht")
public class WebConfig extends WebMvcConfigurationSupport {

	//配置JSP视图解析器
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		super.addInterceptors(registry);
		registry.addInterceptor(new Test1HandlerInterceptor());
	}

	//配置静态资源的处理
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();        //对静态资源的请求转发到容器缺省的servlet，而不使用DispatcherServlet
	}

}
