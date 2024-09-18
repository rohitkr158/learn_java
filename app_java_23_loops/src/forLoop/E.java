package forLoop;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the number : ");
			int number = scan.nextInt();
			
			if (number == 5) {
				System.out.println("You win!");
			} else {
				System.out.println("You loose");
				if(i == 1) {
					System.out.println("Maximum tries over, Better luck next time!");
				}
			}
		}
	}
}
