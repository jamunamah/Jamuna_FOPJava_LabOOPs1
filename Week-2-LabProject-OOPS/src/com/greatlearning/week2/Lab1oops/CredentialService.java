package com.greatlearning.week2.Lab1oops;

import java.util.Random;

public class CredentialService {
	
	Employee emp;
	
	char[] password;
	String email;
	


	public CredentialService(Employee emp) {
		
		this.emp = emp;
	}

	public String generateEmailAddress(String dept) {
		
		email = emp.getFirstName() + emp.getLastName() + "@" + dept + ".abc.com";
		return email;
				
	}
	
	public String generatePassword() {
		
		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*)(_=+/.?<>";
		
		String values = upperCaseLetters + lowerCaseLetters + numbers + specialCharacters;
		
		Random random = new Random(); //Random class
		
		char[] password = new char[8];
		
		for (int i=0; i<8; i++) {
			
			//values.length = length of the whole String
			//get the character at the integer value selected
			
			password[i] = values.charAt(random.nextInt(values.length())); 
			
		}
		
		return String.valueOf(password);
		
	}
	
	
	public void showCredentials() {
		
		
		System.out.println("\nDear " + emp.getFirstName()+ " your generated credentials are as follows:");
		System.out.println("Email    -----> " + email);
		System.out.println("Password -----> " +generatePassword());

	}

}
