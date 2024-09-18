package runTime;

public class NullPointerException1 {
	static NullPointerException1 a1 = null ;		//object not created
	int x = 100;

	public static void main(String[] args) {
//		try {
			System.out.println(a1.x);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("welcome");
	}
}
