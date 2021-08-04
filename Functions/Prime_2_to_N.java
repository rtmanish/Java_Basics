package functions;

import java.util.Scanner;

// To print prime numbers from 2 to N

public class Prime_2_to_N {
	
	public static boolean isPrime(int n) {
		
			for(int d=2;d<n;d++) {
				if(n%d==0) {
					return false;
				}
			}
			return true;
		}
		
	public static void printPrime(int n) {
		
		    for (int i=2;i<=n;i++) {
//			need to check if i is prime or not
			boolean isIprime=isPrime(i);
			if(isIprime) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		printPrime(n);
	}
}
