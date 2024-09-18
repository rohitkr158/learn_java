package design_pattern;

//write a program whose output will be 			1
//												2  3
//												4  5  6
//												7  8  9  10
//											    11 12 13 14 15

public class C {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = i; j <= 15; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 3 && j == 4 || i == 3 && j == 5
						|| i == 3 && j == 6 || i == 4 && j == 7 || i == 4 && j == 8 || i == 4 && j == 9
						|| i == 4 && j == 10 || i == 5 && j == 11 || i == 5 && j == 12 || i == 5 && j == 13
						|| i == 5 && j == 14 || i == 5 && j == 15) {
					System.out.print(j + " ");
				}
			}
			System.out.print("\n");
		}
	}
}
