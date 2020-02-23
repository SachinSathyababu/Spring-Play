package com.sachin.playground.model;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Scanner {
	
	private String name;
	
	private String description;
	
	private int modelNumber;
	
	private int cost;
	
	@PostConstruct
	public void ini() {
		name = "Rama";
		System.out.println("initializing");
	}
	
	@PreDestroy
	public void des() {
		System.out.println("destroying");
	}
	
	
	public Scanner() {System.out.println("creating object");}
	
	public Scanner(String name, String description, int modelNumber, int cost) {
		
		this.name=name;
		this.description=description;
		this.modelNumber=modelNumber;
		this.cost=cost;
	}
	
	//private Date dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void scan() {
		System.out.println("Scanning ...." + name);
	}
	
	/*public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}*/
	
	

}


