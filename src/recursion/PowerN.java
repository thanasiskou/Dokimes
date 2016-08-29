package recursion;
//Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
//powerN(3, 1) = 3
//powerN(3, 2) = 9
//powerN(3, 3) = 27

public class PowerN {
	public static void main(String[] args){
		System.out.println("powerN(3,1) = " + powerN(3,1));
		System.out.println("powerN(3,2) = " + powerN(3,2));
		System.out.println("powerN(3,3) = " + powerN(3,3));
		
	}
	
	public static int powerN(int base, int power){
		if(power == 0){
			return 1;
		}else if(power == 1){
			return base;
		}else{
			return base * powerN(base,power - 1);
		}
	}

}
