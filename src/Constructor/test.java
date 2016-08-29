package Constructor;

public class test {
	public static void main(String[] args){
		constructor x = new constructor("test2",2);
		System.out.println(x.name + " " + x.SSN);
		counter();
		counter2();
		
		for(int i = 0; i < 5;i++){System.out.print(i + ", ");}
		System.out.println();
		for(int i = 0; i < 5;++i){System.out.print(i + ", ");}
	}
	
	public static void counter(){
		int count = 0;
		while(count++ < 5){System.out.print(count + ", ");}
		System.out.print("\n");
	}
	
	public static void counter2(){
		int count = 0;
		while(++count < 5){System.out.print(count + ", ");}
		System.out.print("\n");
	}
}
