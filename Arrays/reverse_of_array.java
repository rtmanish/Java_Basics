package arrays;

import java.util.Scanner;

public class reverse_of_array {

	public static int[] takeinput() {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int[size];
		for(int i=0;i < size;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	public static int[] reverse(int input[]) {
		
		for(int i=input.length-1;i>=0;i--) {
			System.out.print(" "+input[i]);
			
		}
		return input;
	}
	public static void main(String[] args) {
		

		int arr[]=takeinput();
		System.out.println("Reverse is :");
		reverse(arr);
		
	}

}
