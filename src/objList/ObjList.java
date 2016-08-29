package objList;

import java.io.IOException;

public class ObjList {
	
	public static void main(String[] args){
		Object[] arr = new Object[3];
		arr[0] = new Object();
		arr[1] = new Object();
		System.out.println(arr[0]+"\n"+arr[1]);
		
		try{
			Object2 ob = new Object2("Fsdfsdf");
			System.out.println(ob);
		}
		catch(IOException e){
			System.out.println("Error creating object2");
		}
		
	}
}
