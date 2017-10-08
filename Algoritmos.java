package practica05;

public class Algoritmos {
	 	public static void main(String[] args) {	 		 			        
	        int[] insertion = {15,18,1,5,3,-10,100,67,154,45};
	        System.out.println(insertionSort(insertion));	 	        
	        int[] selection = {15,-32,18,1,5,3,79,21,120,99};	 		
	        System.out.println(selectionSort(selection));
	 	}	 	
	 public static  String insertionSort(int[]array){
	        for (int i = 1; i < array.length; i++) {
	            for (int j = 0; j < array.length; j++) {
	                if(j<i && array[j] > array[i]){
	                    shiftContentsRight(array, j,i);
	                }
	            }
	            }
	        String returnString= "[" + array[0];
	        for(int i =1; i< array.length; i++) {
	            returnString += ", " + array[i];
	        }

	        returnString += "]";

	        return  returnString;

	        }

	  public static void shiftContentsRight(int[] array, int start, int end) {
	            if((start < 0 || start > array.length) ) {
	                throw new IndexOutOfBoundsException();
	            }

	            int valueToMove = array[end];

	            for(int i = array.length-1; i >= start; i--) {

	                if(i < end) {
	                    array[i + 1] = array[i];
	                }
	            }
	            array[start] = valueToMove;
	        }
  public static String  selectionSort(int[] array){
	            int smallest=0;
	            int valueToMove = 0;
	            for (int i = 0; i < array.length; i++) {

	                for (int j = 0; j < array.length; j++) {
	                    if(array[i] < array[j]){
	                        smallest = array[j];
	                        valueToMove = array[i];

	                        array[i] = smallest;
	                        array[j] = valueToMove;
	                    }
	                }

	            }
		        String returnString= "[" + array[0];


		        for(int i =1; i< array.length; i++) {
		            returnString += ", " + array[i];
		        }

		        returnString += "]";

		        return  returnString;
		    }     
  }

	 	
	 	
	 	


