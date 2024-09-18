package switch_case;

//switch case will match the value with the case and executes it and breaks the flow with break keyword.
//if non of the value will be matched then it will prints default value

public class A {
	public static void main(String[] args) {
		int key = 1;
		switch (key) {
		case 1:
			System.out.println("value 1");
			break;

		default:
			System.out.println("not value");
			break;
		}
	}
}
