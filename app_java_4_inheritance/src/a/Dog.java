package a;

public class Dog extends Animal {
	public void noise () {
		System.out.println("Bhow Bhow");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.walk();
		dog.sleep();
		dog.noise();
	}
}
