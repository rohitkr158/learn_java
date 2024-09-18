package removing_duplicate_element;

//interview question

public class A {
	public static void main(String[] args) {
		int[] x = {1,1,2,2,3,3,4,4,4,5,6,7,7,8,8,8,8,9,9}; //sorted array
		int[] temp = new int[x.length];
		
		System.out.println(x.length);
		System.out.println(temp.length);
		
		//{1,2,3,4,5,6,7,8,9}
		
		int j = 0;
		for (int i = 0; i < temp.length-1; i++) { 
			if (x[i] != x[i+1]) {  
				temp[j] = x[i];
				j++;
			}
		}
		temp[j] = x[x.length-1];
		
		for (int z : temp) {
			System.out.println(z);
		}
	}
}



