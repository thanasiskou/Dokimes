package recursion;
//Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
//Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
//count7(717) = 2
//count7(7) = 1
//count7(123) = 0
public class Count7 {
	public static void main(String[] args){
		System.out.println("count7(717) = " + count7(717));
		System.out.println("count7(7) = " + count7(7));
		System.out.println("count7(123) = " + count7(123));
		
	}
	
	public static int count7(int n){
		int i = 0;
		if(n < 7){
			return 0;
		}else{
			if(n%10 == 7){
				i = 1;
			}else{
				i = 0;
			}
		}
		return i + count7(n/10);
	}

}
