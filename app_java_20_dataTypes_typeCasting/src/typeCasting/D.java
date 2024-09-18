package typeCasting;


//whenever there's a loss of data during conversion regardless of memory size  upCasting cannot not happen.

public class D {
	public static void main(String[] args) {
		float i = 12.3f;
		long j = i;		//Err loss of data of .3
		System.out.println(j);
	}
}
