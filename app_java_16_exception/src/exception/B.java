package exception;

//exception handling2

public class B {
	public static void main(String[] args) {
		try {
			int x = 30;
			int y = 0;
			int z = x / y;
			System.out.println(z);
		} catch (Exception e) {		//Exception used globally , e is reference variable stores exception object address.
			System.out.println(e);   //prints address with message
			e.printStackTrace();     //prints address with message and location of exception
			System.out.println(e.getMessage());  //prints only message
		}
		System.out.println("welcome");
	}
}
