package org.hexaware;

import org.tcs.Company;

//child class 2
public class AirCanada extends Company {
	
	public void loginDetails() {
		System.out.println("Username : siva");
		System.out.println("Password : qwerty");
	}
	
	public static void main(String[] args) {
		AirCanada a = new AirCanada();
		a.companyId();
		a.companyName();
		a.loginDetails();
	}

}
