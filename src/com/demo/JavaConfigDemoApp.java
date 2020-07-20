package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.component.Coach;
import com.demo.config.SportConfig;

public class JavaConfigDemoApp {
    
    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("volleyCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}