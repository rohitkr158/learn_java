package hashMap;

import java.util.HashMap;

public class A {
	public static void main(String[] args) {
		HashMap<String, String> location = new HashMap<>();

		location.put("Bihar", "Patna");
		location.put("Karnataka", "Bangalore");
		location.put("Goa", "Panji");
		location.put("Haryana", "Chandigarh");

		System.out.println(location);

		// .get()
		System.out.println("\n" + location.get("Bihar"));

		// .remove()
		location.remove("Bihar");
		System.out.println("\n" + location);

		// .size()
		System.out.println("\n" + location.size() + "\n");

		// printing keys
		for (String states : location.keySet()) {
			System.out.println(states);
		}

		// printing values
		for (String capital : location.values()) {
			System.out.println(capital);
		}
		
		
		// Print keys and values
		for (String i : location.keySet()) {
		  System.out.println("key: " + i + " value: " + location.get(i));
		}
		
		
		//clear()
		location.clear();
		System.out.println(location);
	}
}
