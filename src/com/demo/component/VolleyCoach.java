package com.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.service.FortuneService;

@Component
public class VolleyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public VolleyCoach() {
		System.out.println(">> VolleyCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Treine seu saque de bola";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> VolleyCoach: inside setFortuneService");
		this.fortuneService = fortuneService;
	}

}
