package sorting_array;

public class C {
	public static void main(String[] args) {
		int[] salary = { 10000, 23000, 12000, 43000, 18000, 26000, 33000, 44100 };
		int temp;

		for (int j = 0; j < salary.length; j++) {
			for (int i = 0; i < salary.length - 1; i++) {
				if (salary[i] > salary[i + 1]) {
					temp = salary[i];
					salary[i] = salary[i + 1];
					salary[i + 1] = temp;
				}
			}
		}
		for (int x : salary) {
			System.out.println(x);
		}
		System.out.println("minimum salary");
		System.out.println(salary[0]);
		System.out.println(salary[1]);

		System.out.println("maximum salary");
		System.out.println(salary[salary.length - 1]);
		System.out.println(salary[salary.length - 2]);
	}
}