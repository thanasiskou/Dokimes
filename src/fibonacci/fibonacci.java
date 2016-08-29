package fibonacci;

import java.time.Duration;
import java.time.Instant;

public class fibonacci {
	
	public static void main(String[] args){
		for(int i = 0; i <= 10;i++){
			System.out.println("O " + i +"os oros fibonnaci einai me Anadromi: " + fibonacci_n(i) + "  Grammika: " + fibonacci_n_b(i));
		}
		System.out.println("O 30os oros fibonnaci einai me Anadromi: " + fibonacci_n(30) + " Grammika: " + fibonacci_n_b(30));
		System.out.println(fibonacci_n_b2(90));
		
		//Instant start = Instant.now();
		double startTime = System.nanoTime();
		fibonacci_n(45);
		//Instant end = Instant.now();
		//System.out.println("O 45os oros fibonnaci einai me Anadromi xriastike " + Duration.between(start,end) + "sec");
		double endTime = System.nanoTime();
		System.out.println("O 45os oros fibonnaci einai me Anadromi xriastike " + ((endTime - startTime)/1000000000) + "sec");
		
		startTime = System.nanoTime();
		//start = Instant.now();
		fibonacci_n_b2(45);
		//end = Instant.now();
		//System.out.println("O 45os oros fibonnaci einai xoris Anadromi xriastike " + Duration.between(start,end) + "sec");
		endTime = System.nanoTime();
		System.out.println("O 45os oros fibonnaci einai xoris Anadromi xriastike " + ((endTime - startTime)/1000000000) + "sec");
		
	}
	
	public static int fibonacci_n(int n){
		if(n <= 1){
			return n;
		}else{
			return (fibonacci_n(n-1) + fibonacci_n(n-2));
		}
	}
	
	public static int fibonacci_n_b(int n){
		int temp1 = 0;
		int temp2 = 1;
		int temp = 0;
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}else{
			for(int i = 2; i <= n;i++){
				temp = temp2;
				temp2 = temp1 + temp2;
				temp1 = temp;
			}
			return temp2;
		}
	}
	
	public static long fibonacci_n_b2(int n){
		long temp1 = 0;
		long temp2 = 1;
		long temp = 0;
		if(n == 1){
			return 0;
		}else if(n == 2){
			return 1;
		}else{
			for(int i = 3; i <= n;i++){
				temp = temp2;
				temp2 = temp1 + temp2;
				temp1 = temp;
			}
			return temp2;
		}
	}

}
