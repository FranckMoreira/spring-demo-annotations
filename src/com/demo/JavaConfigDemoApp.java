package com.demo;

import com.demo.component.SwinCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.component.Coach;
import com.demo.config.SportConfig;

public class JavaConfigDemoApp {
    
    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwinCoach theCoach = context.getBean("mySwinCoach", SwinCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        System.out.println("Team: " + theCoach.getTeam());
        System.out.println("Email: " + theCoach.getEmail());

        // close the context
        context.close();
    }
}