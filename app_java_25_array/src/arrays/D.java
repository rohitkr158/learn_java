package arrays;

//Array index out of bound exception with try catch block

public class D {
	public static void main(String[] args) {
		String[] name = new String[4];
		try {
			name[0] = "Mike";
			name[1] = "Stallin";
			name[2] = "Adam";
			name[3] = "John";
			name[4] = "Satish"; // Array index out of bound exception handled
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
