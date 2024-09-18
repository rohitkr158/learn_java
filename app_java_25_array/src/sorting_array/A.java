package sorting_array;

public class A {
	public static void main(String[] args) {
		int[] arr = { 12, 33, 54, 32, 56, 87, 43, 22, 34 };
		int temp;

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
	
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int x : arr) {
			System.out.println(x);
		}
		
		System.out.println("last 2 maximum salary / last 2 element");
		System.out.println(arr[arr.length-1]);		//last element
		System.out.println(arr[arr.length-2]);		//2nd last element
		
		
		System.out.println("minimum salary / first 2 elements");
		System.out.println(arr[0]);					//1st element
		System.out.println(arr[1]);					//2nd element
	}
}
