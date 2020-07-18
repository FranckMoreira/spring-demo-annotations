package com.demo.component;

import org.springframework.stereotype.Component;

@Component
public class VolleyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Treine seu saque de bola";
	}

}
