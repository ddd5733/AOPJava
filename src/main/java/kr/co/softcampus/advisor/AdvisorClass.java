package kr.co.softcampus.advisor;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdvisorClass {
	
	@Before("execution(* mehod())")
	public void beforeMehod() {
		System.out.println("beforeMethod ȣ��");
	}
	
	@After("execution(* mehod())")
	public void afterMehod() {
		System.out.println("afterMehod ȣ��");
	}
	
	
	@Around("execution(* mehod())")
	public Object aroundMehod(proceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMehod ȣ��1");
		Object result = pjp.proceed();
		System.out.println("aroundMehod ȣ��2");
		return result;
	}
	
	@AfterReturning("execution(* mehod())")
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod ȣ��");
	}
	
	@AfterThrowing("execution(* method())")
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod ȣ��");
	}
}
