package functions;

import java.util.Scanner;

public class Prime_number {

	public static boolean is_Prime(int n) {
		for(int d=2;d<n;d++) {
			if(n%d==0) {
				return false;
			}
		}
		
		return true;	
		
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		boolean Isprime=is_Prime(n);
		System.out.println(Isprime);
	}

}
