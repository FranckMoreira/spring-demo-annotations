package com.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.service.FortuneService;

@Component
public class JudoCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	public JudoCoach() {
		System.out.println(">> JudoCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		System.out.println(">> JudoCoach: inside getDailyWorkout method");
		return "Treine sua defesa";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">> JudoCoach: inside getDailyFortune method");
		return fortuneService.getFortune();
	}

}
