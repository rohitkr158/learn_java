package stringToDataTypes;

public class A {
	public static void main(String[] args) {
		String x = "100";
		int val1 = Integer.parseInt(x);
		System.out.println(val1);
	
		
		String y = "10.3";
		float val2 = Float.parseFloat(y);
		System.out.println(val2);
	
		
		String z = "100.2";
		double val3 = Double.parseDouble(z);
		System.out.println(val3);

		
		String a = "10";
		long val4 = Long.parseLong(a);
		System.out.println(val4);
		
		
		String b = "20";
		byte val5 = Byte.parseByte(b);
		System.out.println(val5);
		
		
		String c = "54";
		short val6 = Short.parseShort(c);
		System.out.println(val6);
				
	}
}
