package com.sogeti.springComponents;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	
	private String [] data = { "firt strings :-)", "Second Srting :-)", "third String :-)"};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String  theFortune = data[index];
		return theFortune;
	}

}
