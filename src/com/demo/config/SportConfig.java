package com.demo.config;

import com.demo.component.Coach;
import com.demo.component.SwinCoach;
import com.demo.service.FortuneService;
import com.demo.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.demo")
public class SportConfig {

    @Bean
    public FortuneService myFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public SwinCoach mySwinCoach(){
        SwinCoach myCoach = new SwinCoach(myFortuneService());
        return myCoach;
    }
}
