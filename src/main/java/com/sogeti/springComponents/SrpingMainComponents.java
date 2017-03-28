package com.sogeti.springComponents;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SrpingMainComponents {

	public static void main(String[] args) {
		
		// this is when we waant to mapping tha class with the XML file using bean an components.
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext2AddComponent.xml");
	
	
		// this way is let to use the beans (xml) and use the annotation en ComponentsSacn class 
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//Coach coach = context.getBean("tennisCoach", Coach.class);
		
		Coach coach = context.getBean("swinCoach", Coach.class);
		System.out.println("let's gooooo "+ coach.getDeilyComplements());
		System.out.println("let's gooooo of fortune "+ coach.getDeilyComplementsFortune());
		
		context.close();

	}

}
