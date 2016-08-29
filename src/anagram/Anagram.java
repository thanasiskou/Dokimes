package anagram;

public class Anagram {
	
	public static void main(String[] args){
		String word = "123";
		String prefix = "";
		printAnagrams(prefix,word);
		
	}
	
	public static void printAnagrams(String prefix,String word){
		if(word.length() <= 1){
			System.out.println(prefix + word);
		}else{
			for(int i = 0; i < word.length(); i++){
				String cur = word.substring(i, i + 1);
				//System.out.println("cur = "+cur);
				String before = word.substring(0, i); // letters before cur
				//System.out.println("before = "+before);
				String after = word.substring(i + 1); // letters after cur
				//System.out.println("after = "+after);
				printAnagrams(prefix + cur, before + after);
			}
		}
	}

}
