package recursion;
//Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
//endX("xxre") = "rexx"
//endX("xxhixx") = "hixxxx"
//endX("xhixhix") = "hihixxx"
public class EndX {
	public static void main(String[] args){
		System.out.println("endX(\"xxre\") = " + endX("xxre"));
		System.out.println("endX(\"xxhixx\") = " + endX("xxhixx"));
		System.out.println("endX(\"xhixhix\") = " + endX("xhixhix"));
	}
	
	public static String endX(String str){
		if(str.equals("")) return str;
		if(str.charAt(0) == 'x'){
			return endX(str.substring(1)) + "x";
		}else{
			return str.substring(0,1) + endX(str.substring(1));
		}
	}
}
