package org.springframework.emp;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.*;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.LifecycleProcessor;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

public class FullyBeanPostProcessor implements BeanPostProcessor,
		InstantiationAwareBeanPostProcessor,
		SmartInstantiationAwareBeanPostProcessor,
		MergedBeanDefinitionPostProcessor,
		DestructionAwareBeanPostProcessor,
		BeanFactoryPostProcessor,
		ApplicationListener, LifecycleProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanClass == Emp.class) {
			System.out.println("1 --> InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation(beanClass, beanName)");
		}
		return null;
	}

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		if (beanClass == Emp.class) {
			System.out.println("2 --> SmartInstantiationAwareBeanPostProcessor.determineCandidateConstructors(beanClass, beanName)");
		}
		return null;
	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if (beanType == Emp.class) {
			System.out.println("3 --> MergedBeanDefinitionPostProcessor.postProcessMergedBeanDefinition(mbd, beanType, beanName)");
		}

	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (bean instanceof Emp) {
			System.out.println("4 --> InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation(bw.getWrappedInstance(), beanName)");
		}
		return true;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		if (bean instanceof Emp) {
			System.out.println("5 --> InstantiationAwareBeanPostProcessor.postProcessPropertyValues(pvs, filteredPds, bw.getWrappedInstance(), beanName)");
		}
		return pvs;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Emp) {
			System.out.println("6 --> BeanPostProcessor.postProcessBeforeInitialization(result, beanName)");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Emp) {
			System.out.println("7 --> BeanPostProcessor.postProcessAfterInitialization(result, beanName)");
		}
		return bean;
	}

	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		if (bean instanceof Emp) {
			System.out.println("8 --> DestructionAwareBeanPostProcessor.postProcessBeforeDestruction(Object bean, String beanName)");
		}
	}

	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}


	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用了自定义的BeanFactoryPostProcessor " + beanFactory);
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("onApplicationEvent " + event);

	}

	@Override
	public void onRefresh() {
		System.out.println("LifecycleProcessor.onRefresh");
	}

	@Override
	public void onClose() {
		System.out.println("LifecycleProcessor.onClose");
	}

	@Override
	public void start() {
		System.out.println("LifecycleProcessor.start");
	}

	@Override
	public void stop() {
		System.out.println("LifecycleProcessor.onRefresh");
	}

	@Override
	public boolean isRunning() {
		System.out.println("LifecycleProcessor.isRunning");
		return false;
	}
}
