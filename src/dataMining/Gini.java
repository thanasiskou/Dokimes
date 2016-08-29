package dataMining;

public class Gini {
	
	public static void main(String[] args){
		double[] N1 = {4.0,3.0};
		double[] N2 = {2.0,3.0};
		
		System.out.println("Gini N1 = " + calcGini(N1));
		System.out.println("Gini N2 = " + calcGini(N2));
		
		System.out.println("Stathmismenos mesos = "+((7*calcGini(N1))/12 + (5*calcGini(N2))/12));
	}
	
	public static double calcGini(double[] values){
		double ans = 1;
		double valueSum = 0;
		for (int i = 0;i < values.length;i++){
			valueSum += values[i];
		}
		for(int i = 0; i < values.length;i++){
			ans -= Math.pow(values[i]/valueSum,2);
		}
		return ans;
	}

}
