package com.demo.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.demo.service.FortuneService;

@Component
public class VolleyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public VolleyCoach() {
		System.out.println(">> VolleyCoach: inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void myStartupStuff() {
		System.out.println(">> VolleyCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> VolleyCoach: inside of doMycleanupStuff()");
	}

	@Override
	public String getDailyWorkout() {
		System.out.println(">> VolleyCoach: inside getDailyWorkout method");
		return "Treine seu saque de bola";
	}
	
	@Override
	public String getDailyFortune() {
		System.out.println(">> VolleyCoach: inside getDailyFortune method");
		return fortuneService.getFortune();
	}
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> VolleyCoach: inside setFortuneService method");
		this.fortuneService = fortuneService;
	}

}
