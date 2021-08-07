package Searching_and_Sorting;

public class binary_search {

	public static int binarysearch(int[] input ,int elem) {
		int start=0;
		int end=input.length;
		while(start<=end) {
		int mid=(start+end)/2;
		if(elem==input[mid]) {
			return mid;
		}
		else if(elem > input[mid]) {
			start=mid+1;
		}
		else if(elem < input[mid]) {
			end= mid-1;
		}
	}
		return -1;
	}
	public static void main(String[] args) {
		int[] input= {2,4,5,50,67,70,89};
		int index= binarysearch(input, 89);
		System.out.println(index);
		
	}

}
