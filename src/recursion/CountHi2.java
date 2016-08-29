package recursion;
//Given a string, compute recursively the number of times lowercase "hi" appears in the string,
//however do not count "hi" that have an 'x' immedately before them.
//countHi2("ahixhi") = 1
//countHi2("ahibhi") = 2
//countHi2("xhixhi") = 0
public class CountHi2 {
	public static void main(String[] args){
		System.out.println("countHi2(\"ahixhi\") = " + countHi2("ahixhi"));
		System.out.println("countHi2(\"ahibhi\") = " + countHi2("ahibhi"));
		System.out.println("countHi2(\"xhixhi\") = " + countHi2("xhixhi"));
		System.out.println("countHi2(\"xhi\") = " + countHi2("xhi"));

	}
	
	public static int countHi2(String str){
		if(str.length() < 2) return 0;
		if(str.charAt(0) == 'x' && str.charAt(1) == 'h') return countHi2(str.substring(2));
		if(str.substring(0,2).equals("hi")){
			return 1 + countHi2(str.substring(2));
		}else{
			return countHi2(str.substring(1));
		}
	}

}
