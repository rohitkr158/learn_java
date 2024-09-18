package sorting_array;

public class B {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 6, 8, 3, 12, 13, 15, 11, 18, 23, 31, 21, 34 };
		int temp;

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println("sorted array");
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println("first element");
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		System.out.println("last element");
		System.out.println(arr[arr.length - 2]);
		System.out.println(arr[arr.length - 1]);
	}
}