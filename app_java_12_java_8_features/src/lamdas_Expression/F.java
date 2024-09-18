package lamdas_Expression;

public class F {
	public static void main(String[] args) {
		E e1 = (int x)->{
			System.out.println(x);
		};
		e1.test1(10000);
	}
}
