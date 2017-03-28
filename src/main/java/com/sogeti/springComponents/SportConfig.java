
package com.sogeti.springComponents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@ComponentScan("com.sogeti.springComponents")
@Configuration
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		
		return  new SadFortuneService();	
	}
	
	@Bean
	public Coach swinCoach() {
		return new SwinCoach(sadFortuneService());	
	}


}
