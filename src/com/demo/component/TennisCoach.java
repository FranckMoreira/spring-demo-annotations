package com.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.demo.service.FortuneService;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public TennisCoach(@Qualifier("restFortuneService") FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside default constructor");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println(">> TennisCoach: inside getDailyWorkout method");
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">> TennisCoach: inside getDailyFortune method");
		return fortuneService.getFortune();
	}
}