package Examen2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import Stacks.Stack;

public class Main {
	
	public static String reserveseParentheses(String cod) {
			StringBuilder s=new StringBuilder(cod); 
	        StringBuilder c=new StringBuilder(cod); 
		    String h1 = "(";
		    String h2 = ")";
		    ArrayList<Integer> list1 = new ArrayList<Integer>();
		    ArrayList<Integer> list2 = new ArrayList<Integer>();

		    for (int i=0; i<s.length(); i++) {
		        if (s.charAt(i) == h1.charAt(0)) {
		            list1.add(i);
		        }
		    }

		    for (int i=0; i<s.length(); i++) {
		        if (s.charAt(i) == h2.charAt(0)) {
		            list2.add(i);
		        }
		    }

		    Collections.reverse(list1);
		    for (int i=0; i<list1.size(); i++) {
		        int firstIndex = list1.get(i);
		        int lastIndex = list2.get(i);
		        String ascString = s.substring(firstIndex + 1, lastIndex);
		        String reverseString = new StringBuilder(ascString).reverse().toString();
		        s = new StringBuilder(s.toString().replace(s.substring(firstIndex + 1, lastIndex), reverseString));
		        c = new StringBuilder(c.toString().replace(c.substring(firstIndex + 1, lastIndex), reverseString));

		    }
		    s= new StringBuilder(s.toString().replaceAll("\\(", "").replaceAll("\\)",""));
		    return s.toString();
		    c=  new StringBuilder(c.toString().replaceAll("\\(", "").replaceAll("\\)",""));
		    return c.toString();
		    	
	}
	public static void main(String[] args) {
		String s = "a(bc)de";
		String c= "(ab)(cd)(ef)g"; 
	    String outputString = reserveseParentheses(s);
	    System.out.print(outputString);
	    
	    
	   	  
	}

}
