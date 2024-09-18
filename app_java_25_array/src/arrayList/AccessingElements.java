package arrayList;

import java.util.ArrayList;
import java.util.Collections;
//String["Honda","Hyundai","Suzuki","BMW","Volvo","Mercedes"]
public class AccessingElements {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		// adding elements
		cars.add("Honda");		
		cars.add("Hyundai");
		cars.add("Suzuki");
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Mercedes");

		// accessing elements
		String ThirdCar = cars.get(2);
		System.out.println("ThirdCar: " + ThirdCar);
		

		// sorting
		Collections.sort(cars);

		// loop through an ArrayList
		System.out.println("\nSorted array using forLoop");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		// Looping through elements with for each
		System.out.println("\nSorted array using forEach");
		for (String car : cars) {
			System.out.println(car);
		}
		
			
		
	}
}
