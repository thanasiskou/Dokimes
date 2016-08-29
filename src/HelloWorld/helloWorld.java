package HelloWorld;

public class helloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println("Unknown exception");
		}
		System.out.println("Hello world 2!");
		

	}

}
