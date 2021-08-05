package arrays;

import java.util.Scanner;

public class largest_in_array {

	public static int[] takeinput() {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int[size];
		for(int i=0;i < size;i++){
			input[i]=s.nextInt();
		}
		return input;
	}
	
	public static void toprint(int input[]) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	
	public static int largestnumber(int input[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
				}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[]=takeinput();
		toprint(arr);
		int largest=largestnumber(arr);
		System.out.println("Largest is "+ largest);
	}
}
