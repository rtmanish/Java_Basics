package While_loops;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d=2;
		while(d<=n) {
			if(n % d ==0) {
				System.out.println("Not Prime");
				return;
			}
			d=d+1;
		}
		
	    System.out.println("Prime Number");
			
	}

}
