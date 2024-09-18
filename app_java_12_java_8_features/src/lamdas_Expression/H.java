package lamdas_Expression;

public class H {
	public static void main(String[] args) {
		G g1 = (int x , int y)->{
			System.out.println(x);
			System.out.println(y);
		};
		g1.test1(200,600);
	}
}
