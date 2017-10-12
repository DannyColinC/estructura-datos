package practica05;
import java.util.Arrays;
public class HeapSort {
	public static void main(String[]args) {
		 System.out.println("Bubble Sort");
	        int[] bubble = {-5, 10, 23, 110,-3, 2, 7, 95, 40, 1};
	        System.out.println(Arrays.toString(bubble));
	        bubbleS(bubble);
	        System.out.println("Bubble Sort: "+Arrays.toString(bubble));
	        System.out.println("\n\n");
	        
	        System.out.println("Heaps");
	        int uArray[] ={-4, 2, 15,23,6,0};
	        System.out.println(Arrays.toString(uArray)+"\n");
	        System.out.println("MakeHeap:");
	        makeHeap(uArray);
	        System.out.println(Arrays.toString(uArray)+"\n");

	        System.out.println("RemoveTopItem:");
	        removeTopItem(uArray, uArray.length);
	        System.out.println(Arrays.toString(uArray));
	        System.out.println("\n");

	        System.out.println("HeapShort con:");
	        int notHeap[] ={0,38,12,-2,20,17};
	        System.out.println(Arrays.toString(notHeap));
	        heapSort(notHeap);
	        System.out.println(Arrays.toString(notHeap)+"\n");

	        	        
	}
	 public static void bubbleS(int[] arr){
	        boolean notSorted =true;

	        while(notSorted){
	            notSorted =false;
	            for (int i = 1; i < arr.length; i++) {
	                if(arr[i] < arr[i-1]){
	                    int temp = arr[i];
	                    arr[i] = arr[i-1];
	                    arr[i-1] = temp;
	                    notSorted = true;
	                }
	            }
	}

	}
	 public static void makeHeap(int arr[]){

	        for (int i = 0; i < arr.length; i++) {
	            int index=i;
	            while(i != 0){
	                int parent = (index-1) / 2 ;
	                if(arr[index] <= arr[parent]){
	                    break;
	                }
	                int temp = arr[index];
	                arr[index] = arr[parent];
	                arr[parent] = temp;

	                index = parent;
	            }
	        }
	}
	 public static int removeTopItem(int arr[], int count){
	        int result= arr[0];
	        arr[0] = arr[count-1];
	        int index =0;
	        while(true){
	            int childi = 2 *index +1;
	            int childi2 = 2* index +2;

	            if(childi >= count){
	                childi =index;
	            }

	            if(childi2 >= count){
	                childi2 = index;
	            }

	            if(arr[index] >= arr[childi] && arr[index] >= arr[childi2]){
	                break;
	            }
	            int swapChild = childi;
	            if(arr[childi2] > arr[childi]){
	                swapChild = childi2;
	            }
	            int temp = arr[index];
	            arr[index] = arr[swapChild];
	            arr[swapChild] = temp;
	            index = swapChild;
	        }
	        return result;
	    }	 
	 public static void heapSort(int arr[]){
	        makeHeap(arr);
	        int temp;
	        int count = 0;
	        for (int i = arr.length-1; i >= 0; i--) {
	            temp = removeTopItem(arr, arr.length-count);
	            arr[i] = temp;
	            count++;
	        }
	}
	 
}
