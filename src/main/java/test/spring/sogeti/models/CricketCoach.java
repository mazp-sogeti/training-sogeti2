package test.spring.sogeti.models;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emainAddress) {
		this.emailAddress = emainAddress;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("we are in the setter method from CricketCoach");
		this.fortuneService = fortuneService;
	}

	private FortuneService fortuneService;
	
	public CricketCoach (FortuneService theFortuneService){
		System.out.println("CricketCoach Constructor");
		this.fortuneService=theFortuneService;
	}
	public  CricketCoach(){
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "whenever you what from CricketCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
