package com.sogeti.springComponents;

import org.springframework.stereotype.Component;

@Component
public class HappyFotuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "we get lucky----witn components and autowired";
	}
	
}
