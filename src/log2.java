
public class log2 {
	public static void main(String[] args){
		double x = 2.0/5.0;
		System.out.println(-x*calcLog2(x));
	}
	
	public static double calcLog2(double num){
		return Math.log10(num)/Math.log10(2);
	}
}
