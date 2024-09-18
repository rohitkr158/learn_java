package runTime;

public class NullPointerException2 {
	static NullPointerException2 a2 = null;
	int x = 67;
	public static void main(String[] args) {
		try {
			System.out.println(a2.x);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}
}
