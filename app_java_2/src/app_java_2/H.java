package app_java_2;

///return keyword example.

public class H {
	public static void main(String[] args) {   	//step 1
		H h1 = new H();                        	//step 2
		h1.test();						  		//step 3 
		return;									//step 7
	}
	public void test() {						//step 4
		System.out.println(100);				//step 5
		return;	//returns control to line 8		//step 6
	}
}
