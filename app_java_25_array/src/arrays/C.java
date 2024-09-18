package arrays;

//Array index out of bound exception in array

public class C {
	public static void main(String[] args) {
		String[] name = new String[4];

		name[0] = "Mike";
		name[1] = "Stallin";
		name[2] = "Adam";
		name[3] = "John";
		name[4] = "Satish"; // Array index out of bound exception

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("hello");
	}
}
