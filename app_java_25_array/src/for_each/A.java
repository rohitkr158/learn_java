package for_each;

//for_each

public class A {
	public static void main(String[] args) {
		int[] data = new int[3];
		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
				
		for (int i : data) {
			System.out.println(i);
		}
	}
}
