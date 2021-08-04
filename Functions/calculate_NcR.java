package functions;

import java.util.Scanner;

public class calculate_NcR {

	public static int factorial(int n) {
		int s=1;
		for(int i=1;i<=n;i++) {
			s=s*i;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int num1=factorial(n);
		int den1=factorial(r);
		int den2=factorial(n-r);
		int ncr=num1/(den1*den2);
		System.out.println(ncr);
	}

}
