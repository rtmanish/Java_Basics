package Searching_and_Sorting;

public class MergeTwoSortedArrays {

	public static int[] merge(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		int k=0;
		int ans[]=new int[arr1.length + arr2.length];
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				i++;
				k++;
			}
			else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8,9};
		int ans[]=merge(arr1, arr2);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+ " ");
		}

	}

}
