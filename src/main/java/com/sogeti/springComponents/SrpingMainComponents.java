package com.sogeti.springComponents;

import org.springframework.cache.interceptor.CacheableOperation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SrpingMainComponents {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext2AddComponent.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println("let's gooooo "+ coach.getDeilyComplements());
		System.out.println("let's gooooo of fortune "+ coach.getDeilyComplementsFortune());

	}

}
