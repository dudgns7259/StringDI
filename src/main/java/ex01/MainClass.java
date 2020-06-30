package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		SpringTest st = new SpringTest();
//		st.test();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		
		SpringTest test1 = ctx.getBean("test", SpringTest.class);
		SpringTest test2 = ctx.getBean("test", SpringTest.class);
		
		//스프링 IOC컨테이너는 기본적으로 bean을 싱글톤 셩힉으로 생성됩니다.
		//만약, bean을 사용할 때 새로운 객체 형태로 쓰고 싶다면 scope = "prototype"
		System.out.println(test1);
		System.out.println(test2);
		
	}
}
