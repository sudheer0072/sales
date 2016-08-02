package com.sales;


public class Main {

	public Main() {
		System.out.println("Main const");
	}
	
	public static void display() {
		System.out.println("display of Main class");
	}

	public static void main(String[] args) {
		
		Sales sales = new Sales();
		String string  = new String("This is string") ;
		display();
		sales.sales();
		System.out.println(string);
	}

}
