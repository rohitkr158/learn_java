package count_words;

//write a program to find how many letter 'a' and 'b' are there in a given string aabaaababa.

public class B {
	public static void main(String[] args) {
		String str = "aabaaababa";
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count1++;
			} else if (str.charAt(i) == 'b') {
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);

	}

}
