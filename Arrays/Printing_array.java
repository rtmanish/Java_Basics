package arrays;

import java.util.Scanner;

public class Printing_array {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int[size];
		for(int i=0;i < size;i++){
			input[i]=s.nextInt();
		}
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}

}
