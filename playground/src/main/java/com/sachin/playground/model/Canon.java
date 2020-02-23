package com.sachin.playground.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component

@ConditionalOnProperty(name="mmp.printerType" , havingValue = "canon")
public class Canon implements Printer{

	public Canon() {
			System.out.println("Creating canon ..... ");
	// TODO Auto-generated constructor stub
}
	
	
	@Override
	public void print() {
		
		System.out.println("Canon Printer");
		
	}
	
	public void initXYZ(){
		System.out.println("Initi conon printer");
	}
	
	public void dest(){
		System.out.println("destroying conon printer");
	}

}
