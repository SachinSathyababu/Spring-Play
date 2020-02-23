package com.sachin.x.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sachin.playground.model.MultipurposeMachine;
import com.sachin.playground.model.Scanner;

@Configuration
public class Config {

	
	//scanner
	/*@Bean(initMethod = "ini" , destroyMethod = "des")
	@Qualifier("scanner")
	public Scanner scnmachine() {
		Scanner scanner = new Scanner();
		scanner.setCost(100);
		scanner.setDescription("Some Desctription");
		scanner.setModelNumber(12);
		scanner.setName("scnmachine");
		return scanner;
	}
*/
	//scanner
		/*@Bean("smm")
		public Scanner scnmachine2() {
			Scanner scanner = new Scanner();
			scanner.setCost(100);
			scanner.setDescription("Some Desctription");
			scanner.setModelNumber(12);
			scanner.setName("scnmachine2");
			return scanner;
		}*/

}
