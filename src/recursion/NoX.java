package recursion;
//Given a string, compute recursively a new string where all the 'x' chars have been removed.
//noX("xaxb") = "ab"
//noX("abc") = "abc"
//noX("xx") = ""

public class NoX {
	public static void main(String[] args){
		System.out.println("noX(\"xaxb\") = " + "\"" + noX("xaxb") + "\"");
		System.out.println("noX(\"abc\") = " + "\"" + noX("abc") + "\"");
		System.out.println("noX(\"xx\") = " + "\"" + noX("xx") + "\"");
	}
	
	public static String noX(String str){
		if(str.equals("")) return str;
		if(str.charAt(0) == 'x'){
			return noX(str.substring(1));
		}else{
			return str.charAt(0) + noX(str.substring(1));
		}
		
	}
}
