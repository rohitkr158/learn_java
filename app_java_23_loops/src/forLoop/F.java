package forLoop;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the number");
			int number = scan.nextInt();
			
			if (number == 5) {
				System.out.println("Winner!");
				break;
			} else {
				if (i == 2) {
					System.out.println("Max. tries over, Better luck next time..");
					break;
				}
				System.out.println("Please try again!");
			}
		}
	
	}
}
