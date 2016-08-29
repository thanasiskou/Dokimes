package recursion;
//Given a string that contains a single pair of parenthesis,
//compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
//parenBit("xyz(abc)123") = "(abc)"
//parenBit("x(hello)") = "(hello)"
//parenBit("(xy)1") = "(xy)"

public class ParentBit {
	public static void main(String[] args){
		System.out.println("parenBit(\"xyz(abc)123\") = " + parentBit("xyz(abc)123"));
		System.out.println("parenBit(\"x(hello)\") = " + parentBit("x(hello)"));
		System.out.println("parenBit(\"(xy)1\") = " + parentBit("(xy)1"));
	}
	
	public static String parentBit(String str){
		if(str.charAt(0) == '('){
			if(str.charAt(str.length() - 1) == ')'){
				return str;
			}else{
				return parentBit(str.substring(0,str.length() - 1));
			}
		}else{
			return parentBit(str.substring(1));
		}
	}
}
