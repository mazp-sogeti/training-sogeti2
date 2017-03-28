package test.spring.sogeti.models;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load file configuration spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Recover bean from container
		
		
		
		// Use the method on the bean 
		// here we did how we can inject dependency thruogh a method of Coach class, it just make returd a kind of object
		// whit it owe method
		Coach theCoach = context.getBean("myBaseBallCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//this call is for show how inject a dependency in the constructor and also test the owe method
		// the values from this method it was use sport.propeties file and added on the application.xml
		CricketCoach theCricketCoach2 = context.getBean("myCricketCoach", CricketCoach.class);
		CricketCoach theCricketCoach3 = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(theCricketCoach2.getTeam());
		System.out.println(theCricketCoach2.getEmailAddress());
		
		
		// in this section we are looking how we can crate a new and diferents objects  according the request
		//when we adding scope="prototype" on the bean from CricketCoach

		boolean result = (theCricketCoach2==theCricketCoach3);
		System.out.println("\nCheak if the objects are equals:" + result);
		System.out.println("\n theCricketCoach2" +theCricketCoach2);
		System.out.println("\n theCricketCoach2" +theCricketCoach3+"\n");
		System.out.println("\n just prub the git new commit \n");
		
	
		Coach coach = context.getBean("myTrackCoach", Coach.class);
		System.out.println("\nwe are testing the init and destroy methods "+ coach.getDailyWorkout()+"\n");
		
		//close the context
		context.close();
	}
}
