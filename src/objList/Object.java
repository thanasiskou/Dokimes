package objList;
import java.io.*;

public class Object {
	
	protected String text;
	
	public Object(){
		System.out.print("Dose keimeno gia to antikimeno: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			this.text = br.readLine();
		}
		catch(IOException e){
			System.out.println("Error reading text");
		}
	}
	
	public String toString(){
		return "Periexomeno keimeno: " + text;
	}
}
