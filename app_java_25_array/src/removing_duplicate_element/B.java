package removing_duplicate_element;

public class B {
	public static void main(String[] args) {
		int[] x = { 11, 11, 22, 33, 33, 45, 45, 54, 55, 43, 54, 33, 34, 45 }; //error b/c array is not sorted...
		int[] temp = new int[x.length];
		int j = 0;
		
		
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] != x[i + 1]) {
				temp[j] = x[i];
				j++;
			}
		}
		temp[j] = x[x.length - 1];

		for (int z : temp) {
			System.out.println(z);
		}
	}
}







