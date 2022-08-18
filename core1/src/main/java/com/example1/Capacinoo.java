package com.example1;

public class Capacinoo implements CoffeeMachine {
	
	private String Cream;

	public String getCream() {
		return Cream;
	}

	public void setCream(String cream) {
		Cream = cream;
	}

	public void typeOfCoffee() {
		
		System.out.println("This is capacinoo");
		
		
	}

	public void rateOfCoffee() {
		
		System.out.println("It costs two pounds");
		
		
	}

}
