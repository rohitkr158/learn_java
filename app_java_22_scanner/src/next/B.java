package next;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		System.out.println("Enter your full name : ");
		Scanner scan = new Scanner(System.in);
		String fullName = scan.nextLine();			//nextLine() is for full name
		System.out.println("Your full name is : " + fullName);
	}
}
