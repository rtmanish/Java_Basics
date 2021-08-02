package While_loops;

import java.util.Scanner;

public class print_1_to_N {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}

}
