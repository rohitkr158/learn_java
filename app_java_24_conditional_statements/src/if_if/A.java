package if_if;

//if..if statement

public class A {
	public static void main(String[] args) {
		int x = 20;
		if (x > 50) {			//checks the condition
			System.out.println(1);		//condition fails, not print
		}
		if (x > 5) {			//checks the condition
			System.out.println(2);		//condition pass, print
		}
		if (x > 3) {			//checks the condition	
			System.out.println(3);		//condition pass, print
		}
	}
}
