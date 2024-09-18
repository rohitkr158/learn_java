package forLoop;

import java.util.Scanner;

public class K {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter age:");
			int age = scanner.nextInt();
		
		// condition

			if (age >= 18) {
				System.out.println("you can drive!");
				break;
			} else {
				System.out.println("you cannot drive!");
			}
		}
	}
}
