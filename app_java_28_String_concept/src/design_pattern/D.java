package design_pattern;

//write a program whose output will be 			1 1 1 1
//												1 1 1 1
//												1 1 1 1
//												1 1 1 1

public class D {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("1 ");
			}
			System.out.print("\n");
		}
	}
}
