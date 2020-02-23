package com.sachin.x.model;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.sachin.playground.model.MultipurposeMachine;
import com.sachin.playground.model.Printer;
import com.sachin.playground.model.Scanner;

@Configuration

public class Config2 {
	
	@ConfigurationProperties(prefix = "mmp")
	@Bean
	public Properties appProp() {
	    return new Properties();
	}
	
	/*@Bean
	@Lazy
	public MultipurposeMachine mmp(@Qualifier("canon") Printer printer , @Qualifier("xeroxPrinter") Printer printer2,Scanner  scanner, Properties appProp) {
		String value = String.valueOf(appProp.get("printerType"));
		if(value.equals("xerox"))
		{
			return new MultipurposeMachine(printer2, scanner);

		}
		return new MultipurposeMachine(printer, scanner);
	}
*/
	
    @Bean
	@Lazy
	public MultipurposeMachine mmp(Printer printer,Scanner  scanner) {
		return new MultipurposeMachine(printer, scanner);
	}
}
