package p3;

//default(same package sub class)inheritance

public class G extends F {      //iheriting class F from same package
	public static void main(String[] args) {
		G g1 = new G();
		g1.test();					// from test
		System.out.println(g1.x);	// 23;
	}
}
