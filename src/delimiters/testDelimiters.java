package delimiters;

public class testDelimiters {
	public static void main(String[] args){
		String str = "Dokimi-to\nString\tgrammi\n123";
		String[] tokens = str.split("[\\W.]+");//The . character in regex means any character other than new line
		for(String token:tokens){
			System.out.println(token);
		}
	}
}
