package whileLoop;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the pin numnber");
			int pinNumber = scan.nextInt();

			if (pinNumber == 1234) {
				System.out.println("Welcome");

				System.out.println("Enter amount");
				int amount = scan.nextInt();
				System.out.println("Please collect your cash.");

				String condition = "yes";
				while (condition.equals("yes")) {
					System.out.println("Do you want to continue (yes / no)?");
					condition = scan.next();
					System.out.println("Enter the amount");
					int amount1 = scan.nextInt();
					System.out.println("Collect your cash, thank you!");
					break;
				}

				break;
			} else {
				System.out.println("Invalid Pin");
				if (i == 2) {
					System.out.println("Your card is blocked!");
				}
			}
		}
	}
}
