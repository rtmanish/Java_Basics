package If_else;

//Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
//1, if the character is an uppercase alphabet (A - Z)
//0, if the character is a lowercase alphabet (a - z)
//-1, if the character is not an alphabet


import java.util.Scanner;

public class To_Find_character_case {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		char c=str.charAt(0);
		if (65<=c && c<=90)
		{
			System.out.println("1");
		}
		else if (97<=c && c<=122)
		{
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}

}
