package switch_case;

//switch case will match the value with the case and executes it and breaks the flow with break keyword.
//if non of the value will be matched then it will prints default value

public class E {
	public static void main(String[] args) {
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
			break;
		}
	}

}
