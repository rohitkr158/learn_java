package forLoop;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 60; i++) {
			System.out.println("Enter your age");
			int age = scan.nextInt();
			if (age <= 2) {
				System.out.println("you are infant");
			} else if (age <= 12) {
				System.out.println("you are a child");
			} else if (age <= 20) {
				System.out.println("you are a teenager");
			} else if (age <= 60) {
				System.out.println("you are working professional");
			} else {
				System.out.println("you are retired");
				break;
			}
		}
	}
}
