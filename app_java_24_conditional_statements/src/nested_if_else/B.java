package nested_if_else;

//nested if..else
//the moment the condition becomes true it executes and exits

public class B {
	public static void main(String[] args) {
		int x = 20;

		if (x > 50) {				//condition false will check next
			System.out.println(1);
		} else if (x > 7) {			//condition true will execute and exits
			System.out.println(2);
		} else if (x > 20) {		//condition will not be checked as previous condition us true
			System.out.println(3);
		} else {
			System.out.println("else");
		}
	}
}
