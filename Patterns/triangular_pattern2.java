package patterns1;
// for n= 4
//1
//23
//345
//4567

import java.util.Scanner;

public class triangular_pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(i+j-1);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
