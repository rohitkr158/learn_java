package design_pattern;

//write a program whose output will be 			 1 
//											   1 1 1
//											 1 1 1 1 1
//										   1 1 1 1 1 1 1

public class E {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 2 || i == 0 && j == 4 || i == 0 && j == 5 || i == 0 && j == 6 || 
					i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j == 5 || i == 1 && j == 6 ||
					i == 2 && j == 0 || i == 2 && j == 6 ) {
					System.out.print(" ");
				} else {
					System.out.print("1");
				}
			}
			System.out.print("\n");
		}
	}

}
