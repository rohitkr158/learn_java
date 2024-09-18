package swapping;

public class B {
	public static void main(String[] args) {
		String name1 = "Rohit";
		String name2 = "Vyas";
		
		String temp = name1;
		name1 = name2;
		name2 = temp;
		
		System.out.println(name1);		//Vyas
		System.out.println(name2);		//Rohit
		
	}
}
