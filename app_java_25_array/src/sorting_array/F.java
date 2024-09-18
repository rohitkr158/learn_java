package sorting_array;

//sorting of an string array using Arrays.sort()

import java.util.Arrays;

public class F {
	public static void main(String[] args) {
		String[] name = {"rohit","amit","rishabh","vyas","suraj","durga","shailesh"};
		
		Arrays.sort(name);
		
		for (String sortedName : name) {
			System.out.println(sortedName);
		}
	}
}
