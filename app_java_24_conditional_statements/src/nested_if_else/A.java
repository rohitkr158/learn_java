package nested_if_else;

//nested if..else
//the moment any condition becomes true it executes and exits

public class A {
	public static void main(String[] args) {
		int x = 1;

		if (x > 5) {				// when it gets true program stops and will not checks condition further
			System.out.println(1);
		} else if (x > 7) { 		//this will not be checked as previous statement got true
			System.out.println(2);
		} else if (x > 20) { 		
			System.out.println(3);
		} else {
			System.out.println("else");
		}
	}
}
