package com.sachin.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.sachin.playground.model.MultipurposeMachine;
import com.sachin.playground.model.Scanner;

@SpringBootApplication
@ComponentScan("com.sachin")
@PropertySource("classpath:app.properties")
public class PlaygroundApplication {

	public static void main(String[] args) {
		System.out.println("--------Stage 1");
		ConfigurableApplicationContext ctx = SpringApplication.run(PlaygroundApplication.class, args);
		
		
// lesson 1		
//		Scanner scanner1= (Scanner) ctx.getBean("scanner");
//		System.out.println("Name-"+scanner1.getName()+" description-"+scanner1.getDescription()+" Model_Number-"
//				+scanner1.getModelNumber()+" cost-"+scanner1.getCost());
//		
//		Scanner scanner2= (Scanner) ctx.getBean("scanner1");
//		System.out.println("Name-"+scanner2.getName()+" description-"+scanner2.getDescription()+" Model_Number-"
//				+scanner2.getModelNumber()+" cost-"+scanner2.getCost());
//		

	//lesson 2
		System.out.println("--------Stage 2");

		MultipurposeMachine  mmp = (MultipurposeMachine) ctx.getBean("mmp");
		System.out.println("--------Stage 3");
		mmp.printPages();

		mmp.getPrinter().print();
		mmp.getScanner().scan();
	}

}
