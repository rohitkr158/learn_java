package if_if;

//if..if statement with scanner class

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scan.nextInt();

		if (age > 3) {
			System.out.println("child");
		}
		if (age > 13) {
			System.out.println("teenager");
		}
		if (age > 21) {
			System.out.println("adult");
		}
		if (age > 40) {
			System.out.println("aged");
		}
		if (age > 60) {
			System.out.println("old");
		}
	}
}
