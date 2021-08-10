package Strings_and_2D_Array;

public class string_use {

	public static void main(String[] args) {
		String str="abhdh";
		System.out.println(str);
		
		System.out.println(str.charAt(4)); //Returns the char value at thespecified index.
		
		System.out.println(str.substring(2, 4)); //Returns a character sequence that is a subsequence of this sequence. 
		
		System.out.println(str.contains("v"));  //Returns true if and only if this string contains the specifiedsequence of char values.
		
		
	}

}

//Output:
//	abhdh
//	h
//	hd
//	false