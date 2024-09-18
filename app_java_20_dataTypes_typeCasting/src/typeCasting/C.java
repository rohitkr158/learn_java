package typeCasting;

//not done automatically

public class C {
	public static void main(String[] args) {
		long i = 10;
		byte j = i;		//cannot convert high memory to low memory 
		System.out.println(j);
	}
}
