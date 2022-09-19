package com.greatlearning.week2.Lab1oops;

import java.util.Scanner;

//Driver Code

public class Driver {

	public static void main(String[] args) {

		Employee e = new Employee("Harshit", "Choudary"); 
		CredentialService c = new CredentialService(e);

		System.out.println("Please enter your department 1/2/3/4: " + 
						   "\n1. Technical" + 
				           "\n2. Admin" + 
						   "\n3. Human Resource" + 
				           "\n4. Legal");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();

		switch (key) {
		case 1:
			c.generateEmailAddress("tech");
				
			break;

		case 2:
			c.generateEmailAddress("admin");
		
			break;

		case 3:
			c.generateEmailAddress("hr");
			
			break;

		case 4:
			c.generateEmailAddress("legal");
		
			break;

		default:
			System.out.println("Invalid input. Please enter 1/2/3/4");
			break;
		}
		
		//System.out.println(c.generatePassword());
		
		c.showCredentials();
		
		scanner.close();
	}

}
