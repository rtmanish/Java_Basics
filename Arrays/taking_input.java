package arrays;

import java.util.Scanner;

public class taking_input {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int[size];
		for(int i=0;i < size;i++){
			input[i]=s.nextInt();
		}
	}

}
