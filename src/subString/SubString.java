package subString;

public class SubString {
	
	public static void main(String[] args){
		
		String str1 = "Ena dokimastiko string, na ena xedidoni";
		String str2 = "na";
		int i = timesInString(str1,str2);
		System.out.println("To string: \"" + str2 + "\"\nperiexete sto string: \"" + str1 + "\"\n" + i + " fores");
	}
	
	public static int timesInString(String mainStr,String subStr){
		int count = 0;
		for(int i = 0; i < (mainStr.length() - subStr.length() + 1); i++){
			if(subStr.equals(mainStr.substring(i,i + subStr.length()))){
				count++;
				i += subStr.length() - 1;
			}
		}
		return count;
	}

}
