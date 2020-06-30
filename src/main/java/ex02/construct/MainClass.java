package ex02.construct;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		//Hotel클래스를 생성 Chef를 확인
		
//		Chef c = new Chef();
//		
//		Hotel hotel = new Hotel(c);
//		
//		hotel.getChef().cook();
		 
		 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		Hotel h = ctx.getBean(Hotel.class);
		h.getChef().cook();
		

	}

}
