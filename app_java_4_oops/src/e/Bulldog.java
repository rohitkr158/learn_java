package e;

public class Bulldog extends Dog {
	public void guard() {
		System.out.println("guarding..");
	}
	public static void main(String[] args) {
		Bulldog nova = new Bulldog();
		nova.eat();
		nova.walk();
		nova.sleep();
		
		nova.bark();
		
		nova.guard();
	}
}
