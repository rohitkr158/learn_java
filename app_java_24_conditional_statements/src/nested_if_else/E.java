package nested_if_else;

//nested if..else in for loop with scanner class

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Enter age");
			int age = scan.nextInt();

			if (age < 3) {
				System.out.println("infant");
			} else if (age < 13) {
				System.out.println("child");
			} else if (age < 21) {
				System.out.println("teenager");
			} else if (age < 40) {
				System.out.println("adult");
			} else if (age < 60) {
				System.out.println("aged");
			} else {
				System.out.println("old age");
			}
		}
	}
}
