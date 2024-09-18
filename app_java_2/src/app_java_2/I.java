package app_java_2;

//return keyword example with unreachable code error

public class I {
	public static void main(String[] args) {		//step 1
		I i1 = new I();								//step 2
		i1.test();									//step 3
		return;										//step 5
	}
	public void test() {							//step 4
		return;										//step 5
		System.out.println(165);    		//unreachable code error
	}
}
