package Searching_and_Sorting;

public class bubble_sort {

	public static void bubblesort(int input[]) {
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length-1;j++) {
				if(input[j]>input[j+1]) {
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int input[]= {5,2,15,11,21};
		bubblesort(input);
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]+" ");
		}
	}

}
