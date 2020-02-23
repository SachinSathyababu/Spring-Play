package com.sachin.playground.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="mmp.printerType" , havingValue = "xerox")

public class XeroxPrinter implements Printer {
	
	public XeroxPrinter() {
		System.out.println("Creating xerox ..... ");
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Printing Xreox......." + name);
	}
	
	

}
