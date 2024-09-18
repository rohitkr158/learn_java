package if_else;

//If..else statement in for loop with scanner class

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your age : ");
			int age = scan.nextInt();

			if (age >= 18) {   //true
				System.out.println("Eligible for vote..");
				break;
			} else {
				System.out.println("Not eligible for vote..");
			}
		}
	}
}
