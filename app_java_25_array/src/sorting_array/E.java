package sorting_array;

//sorting of an int array using Arrays.sort()

import java.util.Arrays;

public class E {
	public static void main(String[] args) {
		int[] salary = { 45000, 43000, 54000, 73000, 32000, 10000, 12000 };
		
		Arrays.sort(salary);
		
		for (int Salary : salary) {
			System.out.println(Salary);
		}
	}
}
