package com.sachin.x.model;

import com.sachin.playground.model.Printer;

public class PrinterFactory {
	
	Printer getPrinter() {
		return new SomePrinter();
	}

}
