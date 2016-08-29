package threadSync;

public class ThreadStart {
	
	public static void main(String[] args){
		
		Number number = new Number();
		
		for(int i = 0; i < 10;i++){
			AddThread at = new AddThread(number);
			at.start();
		}
		
		System.out.println(number.number);
		
	}

}
