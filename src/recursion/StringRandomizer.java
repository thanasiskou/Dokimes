package recursion;

import java.util.Random;

public class StringRandomizer {
	
	public static void main(String[] args){
		//System.out.println(randInt(0,10));
		System.out.println(randomizeString("123"));
		System.out.println(randomizeString("Dokimi 1234 test 5678"));
		System.out.println(randomizeString("KALIKATZAROS"));
	}
	
	
	public static String randomizeString(String str){
		if(str.length() == 0) return "";
		if(str.length() == 1) return str;
		int i = randInt(0,str.length() - 1);
		return str.charAt(i) + randomizeString(str.substring(0,i) + str.substring(i + 1));
	}
	/*
	public static String randomizeString(String str){
		if(str.length() == 0) return "";
		if(str.length() == 1) return str;
		int i = randInt(0,str.length() - 1);
		return str.charAt(i) + randomizeString(str.substring(0,i)) + randomizeString(str.substring(i+1));
	}*/
	
	public static int randInt(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
		//return min + (int)(Math.random() * ((max - min) + 1));
		}

}
