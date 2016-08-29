package threadSync;

import java.util.Random;

public class Number {
	
	public int number = 0;
	
	public synchronized void add(int i){
		int temp = number;
		emulateDelay();
		temp += i;
		number = temp;
		}
	
	public int getNumber(){
		return number;
	}
	
    public void emulateDelay(){
        int slt = randInt(200, 500);
        try {
             Thread.sleep(slt);                 
        } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
          }
        }
 
 
    public static int randInt(int min, int max) {
       Random rand = new Random();    
       return( rand.nextInt((max - min) + 1) + min );
       }
}
