package test.spring.sogeti.models;

public class BaseBallCoach implements Coach{
	
	
	public BaseBallCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "what happen boys, here we gooooo :-)";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService theFortuneService){
		fortuneService= theFortuneService;
	}

}

