package recursion;
//Given a string, return recursively a "cleaned" string
//where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
//stringClean("yyzzza") = "yza"
//stringClean("abbbcdd") = "abcd"
//stringClean("Hello") = "Helo"

public class StringClean {
	public static void main(String[] args){
		System.out.println("stingClean(\"yyzzza\") = " + stringClean("yyzzza"));
		System.out.println("stingClean(\"abbbcdd\") = " + stringClean("abbbcdd"));
		System.out.println("stingClean(\"Hello\") = " + stringClean("Hello"));
	}
	
	public static String stringClean(String str){
		if(str.length() <= 1){
			return str;
		}
		if(str.charAt(0) == str.charAt(1)){
			return stringClean(str.substring(1));
		}else{
			return str.substring(0,1) + stringClean(str.substring(1));
		}
	}
}
