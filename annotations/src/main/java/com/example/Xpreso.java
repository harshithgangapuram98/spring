package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Xpreso implements Coffee{
	@Autowired
	Capacinoo capacinoo;

	public void typeOfCoffee() {
		System.out.println("This is a Xpreso");
		
	}

	public void rateOfCoffee() {
	System.out.println("It costs 200 rs");
	System.out.println("this is cap cost into");
	capacinoo.rateOfCoffee();
		
	}

}
