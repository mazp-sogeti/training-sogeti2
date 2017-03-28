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
	
	//injection on the constructor 
	public TrackCoach (FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	public void doMyStartUpStuuf(){
		System.out.println("we are inside of init method doMyStartUpStuuf ");
	}
	public void doMyCleanUpStuuf(){
		System.out.println("we are inside of init method doMyCleanUpStuuf ");
	}
	

}
