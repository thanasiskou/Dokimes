import java.util.*;

public class IOtest {
	
	public static void main(String[] args){
		
		int i;
		String str;
		char c;
		
		/*
		Scanner in = new Scanner(System.in);
		System.out.print("i = ");
		i = in.nextInt();
		in.nextLine();
		System.out.print("String = ");
		str = in.nextLine();
		System.out.print("c = ");
		c = in.nextLine().charAt(0);
		
		System.out.println("int = " + i + ", String = " + str + ", char = " + c);
		
		in.close();*/
		
		System.out.print("i = ");
		i = readInt();
		System.out.print("i = " + i);
	}
	
	
	public static int readInt(){
		Scanner in = new Scanner(System.in);
		try{
			int i = in.nextInt();
			return i;
		}catch(InputMismatchException ex1){
			System.out.println("InputMismatchException");
			return -1;
		}catch(NoSuchElementException ex2){
			System.out.println("NoSuchElementException");
			return -2;
		}catch(IllegalStateException ex3){
			System.out.println("IllegalStateException");
			return -3;
		}finally{
			in.close();
		}
	}
}
