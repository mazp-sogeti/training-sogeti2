package com.sogeti.springComponents;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// this component can be whit specific ID or Spring can take the default ID that is the name Class

//if we put scope("prototype"); under the @component spring will create a new Coach instance end diferents 

@Component
public class TennisCoach implements Coach {
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// here we put the injections in this setter almost the same form that constructor injections
	// we need to put always the @AutoWired on the both cases
	// don't happen nothing when change come methods with diferents names
//	@Autowired
//	public void setFortuneServiceeeeeeee(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		System.out.println("heheheheheheheh from constructor");
	}
		
	@Override
	public String getDeilyComplements() {
		// TODO Auto-generated method stub
		return "only test the components from string";
	}

	@Override
	public String getDeilyComplementsFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
