package overriding;

public class Cat extends Dog {				//to override the method inheritance is mandatory
	@Override								
	public void noise() {					//@Override annotation must be there to check the error
		System.out.println("meow meow"); 	// this is called method overriding / updating the method
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		cat.walk();
		cat.sleep();
		cat.noise();
	}
}
