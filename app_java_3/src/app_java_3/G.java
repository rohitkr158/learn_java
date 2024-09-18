package app_java_3;

//this keyword gives same object address

public class G {
	public static void main(String[] args) {
		G g1 = new G();
		System.out.println(g1);
		
		g1.test();
	}
	public void test() {
		System.out.println(this);
	}
}
