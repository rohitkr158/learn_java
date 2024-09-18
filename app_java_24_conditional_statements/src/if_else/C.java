package if_else;

//if..else statement with scanner class

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = scan.nextInt();
		
		if (age >= 18) {  
			System.out.println("Eligible for vote..");
		} else {
			System.out.println("Not eligible for vote..");
		}

	}
}
