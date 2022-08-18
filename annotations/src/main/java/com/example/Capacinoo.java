package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Capacinoo implements Coffee{
	
	private String cream;

	public void typeOfCoffee() {
		System.out.println("This is a Capacinoo");
		
	}

	public String getCream() {
		return cream;
	}
	
	@Value("yes")
	public void setCream(String cream) {
		this.cream = cream;
	}

	public void rateOfCoffee() {
		
		System.out.println("It costs 100 rs");
		
	}

}
