package switch_case;

//switch case will match the value with the case and executes it and breaks the flow with break keyword.
//if non of the value will be matched then it will prints default value

public class B {
	public static void main(String[] args) {
		int value = 2;
		switch (value) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		default:
			System.out.println(3);
			break;
		}
	}
}
