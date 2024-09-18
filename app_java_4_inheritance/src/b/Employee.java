package b;

//Write a Java program to create a class called Employee 
//with methods called work() and getSalary(). Create a subclass
//called HRManager that overrides the work() method and adds 
//a new method called addEmployee().

public class Employee {
	public void work() {
		System.out.println("working");
	}

	public void getSalary() {
		System.out.println("getting salary");
	}
}