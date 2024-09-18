package whileLoop;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cdn = "yes";
		while (cdn.equals("yes")) {
			System.out.println("Enter the amount");
			int amount = scan.nextInt();
			System.out.println("please collect cash");
			System.out.println("Do you want to continue? (yes/no)");
			cdn = scan.next();
		}
	}
}
