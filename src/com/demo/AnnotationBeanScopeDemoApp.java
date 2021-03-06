package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.component.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean isSameObject = (theCoach == alphaCoach); 
		
		// print out the results
		System.out.println(String.format("\nPointing to the same object: %s", isSameObject));
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// close the context
		context.close();
		

	}

}
