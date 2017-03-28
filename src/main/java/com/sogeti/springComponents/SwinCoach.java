package com.sogeti.springComponents;

public class SwinCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwinCoach( FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDeilyComplements() {
		// TODO Auto-generated method stub
		return " heyy i am swiming inj the best pool by warm up in swinCoacn method";
	}

	@Override
	public String getDeilyComplementsFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
