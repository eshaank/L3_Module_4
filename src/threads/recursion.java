package threads;

public class recursion {
	public static void main(String[] args) {
		hi("hello");
		//factorial(1000);
	}
	
 static String hi(String bob) {
	 int num = bob.length();
	 System.out.println(bob.length());
	return "";
	
 
}
	public static long factorial(int n) { 
	    if (n == 1) return 1; 
	    System.out.println( n * factorial(n-1));
	    return n * factorial(n-1); 
	} 
}
