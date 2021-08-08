package Searching_and_Sorting;

public class selection_sort {

	public static void selectionsort(int[] input) {
		
		for(int i=0;i<input.length-1;i++) {
		
			int min=input[i];
			int minIndex=i;
			
			for(int j=i+1;j<input.length;j++) {
				if(input[j]<min) {
					min=input[j];
					minIndex=j;
				}
			}
			if(minIndex != i) {
			input[minIndex]=input[i];
			input[i]=min;
			}
		}
	}
	public static void main(String[] args) {
	 
		int[] arr= {4,10,5,7,1};
		selectionsort(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

}
