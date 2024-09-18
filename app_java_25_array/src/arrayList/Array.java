package arrayList;

import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		// adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		
		System.out.println("Fruits list: " + fruits);
		
		
		//looping through an ArrayList using forLoop
		System.out.println("\nlooped through an ArrayList");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		// Accessing elements by index
		System.out.println("\nAccessed first element by index");
		String firstFruit = fruits.get(0);
		System.out.println("First fruit: " + firstFruit);

		// Looping through elements with for each
		System.out.println("\nLooped through elements");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// removing elements
		System.out.println("\nremoved first element");
		fruits.remove(0);
		System.out.println("new fruits array: " + fruits);

		// change an element
		System.out.println("\nUpdated array");
		fruits.set(0, "Grapes");
		System.out.println(fruits);

		// check size of an array
		System.out.println("\nfruits size: " + fruits.size());

		/// remove all elemets
		System.out.println("\nremoved all elemets of an array");
		fruits.clear();
		System.out.println(fruits);

	}
}
