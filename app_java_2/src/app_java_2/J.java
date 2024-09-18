package app_java_2;

//return value with integer

public class J {
	public static void main(String[] args) {			//step 1
		J j1 = new J();									//step 2
		int x = j1.test();								//step 3
		System.out.println(x);							//step 6 
	}													//step 7
	public int test() {									//step 4
		return 1300;									//step 5
	}
}
