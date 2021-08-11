package Strings_and_2D_Array;

import java.util.Scanner;

public class largest_col_sum {

	public static int[][] takeinput(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows=s.nextInt();
		System.out.println("Enter number of columns ");
		int cols=s.nextInt();
		int input[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter element at "+i+" 2rows "+j+" columns");
				input[i][j]=s.nextInt();
			}
		}
		return input;
	}
	public static void print(int[][] input) {
		int rows=input.length;
		int cols=input[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int largestcolsum(int[][] input) {
		int largest=Integer.MIN_VALUE;
		int rows=input.length;
		int cols=input[0].length;
		for(int j=0;j<cols;j++) {
			int sum=0;
			for(int i=0;i<rows;i++) {
				sum=sum+input[i][j];
			}
			if(sum>largest) {
				largest= sum;
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		int arr2d[][]=takeinput();
		print(arr2d);
		System.out.println("Largest is: "+ largestcolsum(arr2d));
	}

}
