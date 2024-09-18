package app_java_2;

//static variable example

public class V {
	static int x;							//not initialized
	public static void main(String[] args) {
		System.out.println(V.x);				//print default value 
						//when not initialized in static variable
	}
}
