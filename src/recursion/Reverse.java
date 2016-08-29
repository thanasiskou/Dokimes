package recursion;

public class Reverse {
	public static void main(String[] args){
		String str = "12345";
		System.out.println("Recursive\nString: " + str + "\nReverse String: " + reverse(str));
		System.out.println("\nNon-Recursive\nString: " + str + "\nReverse String: " + reverse2(str));
		
	}
	
	
	//Recursive
	public static String reverse(String str){
		if(str.length() == 0) return "";
		return str.substring(str.length() - 1) + reverse(str.substring(0,str.length() - 1));
	}
	
	//Non recursive
	public static String reverse2(String str){
		StringBuffer strbuff = new StringBuffer(str);
		for(int i = 0, j = strbuff.length() - 1; i < str.length();i++, j--){
			strbuff.setCharAt(i,str.charAt(j));
		}
		return strbuff.toString();
	}

}
