package Strings_and_2D_Array;

public class print_prefix {

	public static void printprefix(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.substring(0, i+1));
	
		}
	}
	public static void main(String[] args) {
		String str= "abcde";
		printprefix(str);		
		
	}

}

// Output:
//	a
//	ab
//	abc
//	abcd
//	abcde
