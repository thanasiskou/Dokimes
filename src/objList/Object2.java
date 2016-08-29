package objList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Object2 {
	protected String text;
	
	public Object2(String text) throws IOException{
		System.out.print("Dose keimeno gia to antikimeno type 2: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		this.text = br.readLine();
	}
	
	public String toString(){
		return "Periexomeno keimeno: " + text;
	}
}
