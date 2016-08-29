package Thread1;

public class PingPong extends Thread {
	String word;
	int delay;
	
	public PingPong(String word,int delay){
		this.word = word;
		this.delay = delay;
	}
	
	public void run(){
		try{
			for(int i = 0;;i++){
				System.out.print(word + "-" + i + " ");
				sleep(delay);
				}
			}catch(InterruptedException ex){
				return;
			}
	}

}
