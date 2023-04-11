package com.test.cts;

import org.tcs.Company;

//child class

public class Details extends Company {
	
	public void age() {
		System.out.println("Age is 28");
	}

	public static void main(String[] args) {
		Details d = new Details();
		d.age();
		d.companyId();
		d.companyName();
		
		
			}
}
