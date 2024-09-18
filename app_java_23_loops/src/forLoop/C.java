package forLoop;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int attempt = 1; attempt <= 3; attempt++) {
			System.out.println("Enter Pin Number");
			int pinNumber = scan.nextInt();

			if (pinNumber == 1234) {
				System.out.println("Welcome");
				break;
			}
else {
				System.out.println("Invalid Pin Number.");
				if (attempt == 3) {
					System.out.println("Your card is blocked...");
				}
			}
		}
	}
}
