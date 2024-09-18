package typeCasting;

//multi-downCating

public class I {
	public static void main(String[] args) {
		long i = 100;
		byte j = (byte)(short)(int)i;
		System.out.println(j);
	}
}
