package Recursion;

public class Main {
	 public static void main(String[] args) {

	        int[] arr = {6,0,10,2,6,6};
	        int[] arr11 = {11,11,0,1,2,4,11};

	        System.out.println("Metodo Factorial");
	        System.out.println(factorial(6));
	        System.out.println("\n");
	        System.out.println("Metodo bunnyEars");
	        System.out.println(bunnyEars(10));
	        System.out.println("\n");
	        System.out.println("Metodo bunnyEars2");
	        System.out.println(bunnyEars2(10));
	        System.out.println("\n");
	        System.out.println("Metodo fibonnaci");
	        System.out.println(fibonacci(6));
	        System.out.println("\n");
	        System.out.println("Metodo triangle");
	        System.out.println(triangle(2));
	        System.out.println("\n");
	        System.out.println("Metodo sumDigits");
	        System.out.println(sumDigits(1996));
	        System.out.println("\n");
	        System.out.println("Metodo count7");
	        System.out.println(count7(7));
	        System.out.println("\n");
	        System.out.println("Metodo count8");
	        System.out.println(count8(1988));
	        System.out.println("\n");
	        System.out.println("Metodo countX");
	        System.out.println(countX("xxxhixxx"));
	        System.out.println("\n");
	        System.out.println("Metodo powerN");
	        System.out.println(powerN(2,0));
	        System.out.println("\n");
	        System.out.println("Metodo changeXY");
	        System.out.println(changeXY("xxxhixxx"));
	        System.out.println("\n");
	        System.out.println("Metodo array6");
	        System.out.println(array6(arr,0));
	        System.out.println("\n");
	        System.out.println("Metodo array11");
	        System.out.println(array11(arr11,0));

	}
	public static int factorial(int n) {
		  if(n==0){
		  return 1; 
		  }else{
		   return n*factorial(n-1);  
		  }
		 
		}
	public static int bunnyEars(int bunnies) {
		  if(bunnies==0)
		  return 0; 
		  return 2+bunnyEars(bunnies-1); 
		}
	
	public static int fibonacci(int n) {
		  if(n<2)
		  return n; 
		  return fibonacci(n-2)+fibonacci(n-1); 
    }
	
	public static int bunnyEars2(int bunnies) {
	    if(bunnies == 0)
			return 0;
		if(bunnies % 2 ==1)
	    return 2 + bunnyEars2(bunnies-1);
		return 3 + bunnyEars2(bunnies-1); 
		
	}
	public static int triangle(int rows) {
		  if(rows < 2)
				return rows;
		    return rows + triangle(rows-1);
		}
    
	public static int sumDigits(int n){
		if(n < 10)
			return n;
		return sumDigits(n/10) + n%10;
	}
	public static int count7(int n){
	if(n == 0)
		return 0;
	if(n % 10 == 7)
		return 1+count7(n/10);
        return count7(n/10);
	}
	 public static int count8(int n) {
	        int count =0 ;
	        if(n/10 == 0 ){
	            if(n%10 == 8){
	                count+=1;
	            }
	            return count;
	        }
	        if(n%10 == 8){
	            count++;
	            if(n/10%10 == 8){
	                count++;
	            }
	            return count + count8(n/10);
	        }
	        return count + count8(n/10);
	    }

	
	public static int powerN(int base, int n) {
		  if(n == 1)
				return base;
		return base*powerN(base, n - 1);
		}
	public static int countX(String str) {
		if(str.length() == 0)
			return 0;
		if(str.charAt(0) == 'x')
			return 1 + countX(str.substring(1));
	return countX(str.substring(1));
		  
	}
	public static String changeXY(String str){
		char ch;
		if(str.length() == 0)
			return str;
		ch = str.charAt(0);
		if(ch == 'x')
			return 'y' + changeXY(str.substring(1));
		return ch + changeXY(str.substring(1));
	}
	public static boolean array6(int[] nums, int index) {
	if(index == nums.length)
	  	return false;
	  if(nums[index] == 6)
	  	return true;
	return array6(nums, index + 1);
	}
	public static int array11(int[] nums, int index){
		if(index == nums.length)
			return 0;
		if(nums[index] == 11)
			return 1 + array11(nums, index + 1);
		return array11(nums, index + 1);
	}
	  
	}



