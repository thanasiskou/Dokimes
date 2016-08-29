package recursion;
//Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
//factorial(1) = 1
//factorial(2) = 2
//factorial(3) = 6

public class factorial {
	public static void main(String[] args){
		System.out.println("factorial(1) = " + factorial_n(1));
		System.out.println("factorial(2) = " + factorial_n(2));
		System.out.println("factorial(3) = " + factorial_n(3));
	}
	public static int factorial_n(int n){
		if(n == 1){
			return 1;
		}else{
			return n*factorial_n(n-1);
		}
	}
}
