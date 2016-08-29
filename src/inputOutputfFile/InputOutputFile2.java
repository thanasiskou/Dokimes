package inputOutputfFile;

import java.io.*;

public class InputOutputFile2 {
	public static void main(String[] args){
		File file = new File("test.txt");
		String text = readFile(file);
		//System.out.println(text);
		writeFile(text,"test2.txt");
	}
	
	public static String readFile(File file){
		String text = null;
		StringBuffer sb = new StringBuffer();
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((text = br.readLine()) != null){
				System.out.println(text);
				sb.append(text);
				sb.append("\n");
			}
			br.close();
			text = sb.toString();
			text = text.substring(0,text.length()-1);
			return text;
		}catch(FileNotFoundException ex1){
			System.out.println("Unable to OPEN file: "+file);
			return null;
		}catch(IOException ex2){
			System.out.println("Unable to READ file: "+file);
			return null;
		}catch(IndexOutOfBoundsException ex3){
			System.out.println("Empty file: "+file);
			return null;
		}
	}
	
	public static void writeFile(String text, String filename){
		if(text == null){
			System.out.println("Null string of characters, can't write");
			return;
		}
		try{
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println(text);
			bw.write(text);
			bw.close();
		}catch(IOException e){
			System.out.println("Error writing to file: "+filename);
		}
	}
	
}
