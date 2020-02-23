package com.sachin.playground.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MultipurposeMachine {

	
	
	private Printer printer;
	
	
	private Scanner scanner;
	
	@Value("${mmp.pages}")
	private int pages;
	
	@Autowired
	public MultipurposeMachine(Printer x, Scanner scanner) {
		super();

		System.out.println("Constructing");
		this.printer = x;
		this.scanner = scanner;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setRambo(Printer printer) {
		this.printer = printer;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void printPages() {
		System.out.println("Pages - "+ pages);
	}
	
	
}

