package threadSync;

public class AddThread extends Thread{
	
	public Number number;
	
	public AddThread(Number num){
		number = num;
	}
	
	public void run(){
		
		number.add(1);
	}

}
