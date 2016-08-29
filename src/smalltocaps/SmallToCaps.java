package smalltocaps;
import java.io.*;

public class SmallToCaps {
	
	public static void main(String[] args){
		
		String str = "Keimeno gia Allagi, doulevei";
		
		System.out.println("Se caps kanonika: " + toCaps(str));
		System.out.println("Se caps me anadromi: " + toCaps2(str));
		
		System.out.println(str);
		
		System.out.println(removeSpace(str));
		System.out.println(toCaps(removeSpace(str)));
		readPrintLine();

	}
	
	public static String toCaps(String str){
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i++){
			if(charArray[i] > 96 && charArray[i] < 123 ){
				charArray[i] = (char)(charArray[i] - 32);
			}
		}
		String myString = new String(charArray);
		return myString;
	}
	//RECURSION
	public static String toCaps2(String str){
		if(str.length() < 1) return "";
		if(str.charAt(0) > 96 && str.charAt(0) < 123){
			return ((char)(str.charAt(0) - 32)) + toCaps2(str.substring(1));
		}else{
			return str.charAt(0) + toCaps2(str.substring(1));
		}
	}
	
	public static String removeSpace(String str){
		char[] charArray = str.toCharArray();
		int n = 0;
		for(int i = 0; i < charArray.length; i++){
			if(charArray[i] == ' '){
				n++;
			}
		}
		char[] newCharArray = new char[charArray.length - n];
		for(int i = 0,j = 0; i < charArray.length; i++){
			if(charArray[i] == ' '){
				;
			}else{
				newCharArray[j] = charArray[i];
				j++;
			}
		}
		String newString = new String(newCharArray);
		return newString;
	}
	
	public static void readPrintLine(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input string: ");
		try{
			String text = br.readLine();
			System.out.println(text);
			System.out.println(toCaps(removeSpace(text)));
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
