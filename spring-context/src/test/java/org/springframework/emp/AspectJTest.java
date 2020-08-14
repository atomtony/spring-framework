package org.springframework.emp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test() {
		System.out.println("AspectJTest.test");
	}

	@Before("test()")
	public void beforTest() {
		System.out.println("beforTest");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object aroutTest(ProceedingJoinPoint p) {
		System.out.println("befor1");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}

}
