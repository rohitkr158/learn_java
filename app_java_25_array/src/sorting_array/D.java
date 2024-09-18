package sorting_array;

//Simple way of sorting an array using Arrays.sort()

import java.util.Arrays;

public class D {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 7, 1 };

		System.out.println("Original array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}

		Arrays.sort(numbers); // Sorts the array in ascending order

		System.out.println("\nSorted array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
