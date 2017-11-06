package MergeSort;
import Stacks.Stack;
import java.util.Arrays; 

public class MergeSort {
	public static void main(String[] args) {
		 System.out.println("Merge Sort");
	        int[] uArray1 = {10,17,1,3,2,100,99,900,60,-3};
	        int[] scratch = new int[uArray1.length];
	        System.out.println(Arrays.toString(uArray1));
	        mergeSort(uArray1, scratch, 0, uArray1.length-1);
	        System.out.println("Merge Sort: "+Arrays.toString(uArray1));
	         System.out.println("\n\n");
	}
	 public static void mergeSort(int [] arr, int[] arrs, int start, int end) {

	        if (start >= end) {
	            return;
	        }

	        int midpoint = (start+end)/2;

	        mergeSort(arr,arrs,start,midpoint);
	        mergeSort(arr,arrs,midpoint+1,end);

	        int leftIndex = start;
	        int rightIndex = midpoint + 1;

	        int scratchIndex = leftIndex;

	        while(leftIndex <= midpoint && rightIndex <= end) {

	            if(arr[leftIndex] <= arr[rightIndex]) {
	                arrs[scratchIndex] = arr[leftIndex++];

	            }else {
	                arrs[scratchIndex] = arr[rightIndex++];

	            }

	            scratchIndex++;
	        }

	        for (int i = leftIndex; i <= midpoint ; i++) {
	            arrs[scratchIndex++] = arr[i];

	        }

	        for (int i = rightIndex; i <= end ; i++) {
	            arrs[scratchIndex++] = arr[i];

	        }

	        for (int i = start; i <= end; i++) {
	            arr[i]=arrs[i];
	        }

	}
}
