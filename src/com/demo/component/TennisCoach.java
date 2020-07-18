package com.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.service.FortuneService;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
    
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    
    @Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}