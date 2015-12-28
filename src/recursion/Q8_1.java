package recursion;

/**
 * @author Nishant
 * Generate nth fibonacci number
 */
public class Q8_1 {
	
	public static int nthFibNumber(int n){
		int a = 0;
		int b = 1;
		int fib = 1;
		if(n==1)
			return a;
		else if (n==2)
			return b;
		else
			return fib(a,b,n-2);
	}
	
	public static int fib(int a, int b,int n){
		if(n==1)
			return a+b;
		else
			return fib(b,a+b,n-1);
	}
	
	public static void main(String[] args){
		System.out.println(nthFibNumber(7));
	}

}
