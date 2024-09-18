package runTime;

public class NumberFormatException2 {
	public static void main(String[] args) {
		try {
			String x = "Rohit";
			int val2 = Integer.parseInt(x);
			System.out.println(val2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}
}
