package app_java_2;

//static and void method with arguments

public class G {
	public static void main(String[] args) {
		G g1 = new G();
		g1.test(23, "rohit", 78.65);
	}
	public void test(int x, String y, double z) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
