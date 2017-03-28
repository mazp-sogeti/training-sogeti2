package test.spring.sogeti.models;

public class myWebAppMain {

	public static void main(String[] args) {
		
		
		
		Coach baseballcoach = new BaseBallCoach();
		Coach trackcoach = new TrackCoach();
		System.out.println(baseballcoach.getDailyWorkout());
		System.out.println(trackcoach.getDailyWorkout());
	}
}
      