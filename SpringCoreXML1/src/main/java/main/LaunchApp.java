package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

	public static void main(String[] args) {
		
		//AplicationContext(I) container
		//BeanFactory(I)
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		 
		
	}

}
