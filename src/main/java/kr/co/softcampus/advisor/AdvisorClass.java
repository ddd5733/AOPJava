package kr.co.softcampus.advisor;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdvisorClass {
	
	@Before("execution(* mehod())")
	public void beforeMehod() {
		System.out.println("beforeMethod 호출");
	}
	
	@After("execution(* mehod())")
	public void afterMehod() {
		System.out.println("afterMehod 호출");
	}
	
	
	@Around("execution(* mehod())")
	public Object aroundMehod(proceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMehod 호출1");
		Object result = pjp.proceed();
		System.out.println("aroundMehod 호출2");
		return result;
	}
	
	@AfterReturning("execution(* mehod())")
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	@AfterThrowing("execution(* method())")
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod 호출");
	}
}
