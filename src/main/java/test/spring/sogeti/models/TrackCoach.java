package test.spring.sogeti.models;

public class TrackCoach implements Coach {
	
	

	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "this message is from class TrackCoach that implement from Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	public TrackCoach (FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	

}
