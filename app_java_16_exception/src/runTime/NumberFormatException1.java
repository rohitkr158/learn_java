package runTime;

public class NumberFormatException1 {
	public static void main(String[] args) {
		try {
			String x = "mike";
			int val1 = Integer.parseInt(x);
			System.out.println(val1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("welcome");
	}
}
