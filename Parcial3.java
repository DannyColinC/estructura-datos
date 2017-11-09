package E3P;
import java.util.ArrayList;
import java.util.Arrays; 
import practica3.LinkedList;
public class Parcial3 {
	 public static void main(String[] args) {
//       System.out.println("hello");
//       System.out.println("abc");
//       System.out.println("ab");
//       System.out.println("a");
//       System.out.println("a");
//       System.out.println("x");
//       System.out.println();		 
//       System.out.println("rexx");
//       System.out.println("xxhixx");
//       System.out.println("xhixhix");
//       System.out.println();	
//       System.out.println("(a(b)(c)(d(e(f)g)h)I(j(k)l)m");
//       System.out.println("(p((q))((s)t))");
//       System.out.println("");
//       System.out.println("b)(c)()");
//       System.out.println("(b)((c)()");
//       System.out.println();
//       System.out.println("1");
//       System.out.println("2");
//       System.out.println("3"); 
//       System.out.println("4");
//       System.out.println(); 
		 String str = "abc";
	        System.out.println(allStar(str));
	        str = "rexx";
	        System.out.println(endX(str));
	        LinkedList<Integer> list1 = new LinkedList<Integer>();
	        for(int i=0; i <10; i++){
	            list1.addLast(i);
	        }
	        System.out.println(list1.toString());
	        LinkedList<Integer> list2 =new LinkedList<Integer>();
	        for(int i=5; i <16; i++){
	            list2.addLast(i);
	        }

	        System.out.println(list2.toString());
	        LinkedList<Integer> intersection = new LinkedList<Integer>();
	        intersection = intersect(list1, list2);
	        System.out.println(intersection.toString());
	        LinkedList<Integer> difference = new LinkedList<Integer>();
	        difference = difference(list1, list2);
	        System.out.println(difference.toString());

	        System.out.println(shapeArea(3));
	}
	 }
	 public static String allStar(String str) {
	 if (str.length() <= 1) {
		    return str;
		} else {
		    return str.charAt(0) + "*" + allStar(str.substring(1));
		}
	}
	 public static String endX(String str) {
			if (str.length() == 0) {
			    return str;
			} else if (str.charAt(0) == 'x') {
			    return endX(str.substring(1)) + "x";
			} else {
			    return str.charAt(0) + endX(str.substring(1)); 
			}
	 }
	//
   
	 public static LinkedList<Integer> intersect (LinkedList<Integer> list1, LinkedList<Integer> list2){
	        LinkedList<Integer> intersectLinked = new LinkedList<Integer>();
	        for (int i = 0; i < list1.size(); i++) {
	            for (int j = 0; j <list2.size() ; j++) {
	                if(list1.get(i).equals(list2.get(j))){
	                    intersectLinked.addLast(list1.get(i));
	                }
	            }
	        }

	        return intersectLinked;
	    }

	    public static LinkedList<Integer> difference (LinkedList<Integer> list1, LinkedList<Integer> list2){
	        LinkedList<Integer> differenceLinked = new LinkedList<Integer>();
	        boolean input = false;
	        for (int i = 0; i < list1.size(); i++) {
	            for (int j = 0; j <list2.size() ; j++) {
	                if(list1.get(i).equals(list2.get(j))){
	                    input = true;
	                }
	            }
	            if(!input){
	                differenceLinked.addLast(list1.get(i));
	            }
	        }

	        return differenceLinked;
	}
		
	
	  
public static int shapeArea(int n){
    int x;
    if(n == 1){
        return 1;
    }
    if(n-1 == 1){
        x = n*n;
    } else{
        x = n + (2*(n-1)) + (n-2);
    }
    return x + shapeArea(n-1) ;

}
	
}

