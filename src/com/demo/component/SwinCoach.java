package com.demo.component;

import com.demo.service.FortuneService;

public class SwinCoach implements Coach {

    private FortuneService fortuneService;

    public SwinCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Treine 100x nado borboleta";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
