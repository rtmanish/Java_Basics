package If_else;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rem=num%2;
		if(rem==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}

	}

}
