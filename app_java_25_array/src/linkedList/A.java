package linkedList;

import java.util.LinkedList;

public class A {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("Honda");
		System.out.println(cars);
		
		
		//addFirst()  , addLast()
		cars.addFirst("BMW");
		cars.addLast("Mercedes");
		System.out.println(cars);

		
		//getFirst()  , getLast()
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		
		
		//removeFirst()  , removeLast()
		cars.removeFirst();
		cars.removeLast();
		System.out.println(cars);
	}
}
