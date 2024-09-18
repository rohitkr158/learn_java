package sorting_array;

//selectionSort

public class G {
	public static void main(String[] args) {
		int[] numbers = { 5, 2, 8, 7, 1 };

		System.out.println("Original array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}

		selectionSort(numbers);

		System.out.println("\nSorted array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
	//{ 5, 2, 8, 7, 1 };
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
					//{2,5,8,7,1}
					//{1,2,5,8,7}
					//{1,2,5,7,8}
				}
			}
			// Swap the found minimum element with the first element of the unsorted
			// sub-array
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

}
