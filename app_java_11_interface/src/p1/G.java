package p1;

//implementing interface F in G

public class G implements F{

	@Override
	public void test1() {
		System.out.println(98765);
	}

	@Override
	public int test2(int x) {
		return x;
	}
	public static void main(String[] args) {
		G g1 = new G();
 		g1.test1();
		int val = g1.test2(200);
		System.out.println(val);
	}
}
