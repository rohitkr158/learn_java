package arrays;

//array with loop

public class B {
	public static void main(String[] args) {
		String[] name = new String[4];
		name[0] = "Mike";
		name[1] = "Stallin";
		name[2] = "Adam";
		name[3] = "John";

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
