package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {

	public void method1() throws Exception{
		System.out.println("TestBean1¿« method1() »£√‚");
		
		int a1 = 10/0;
	}
}
