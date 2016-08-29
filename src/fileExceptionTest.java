import java.io.*;
import java.util.*;

public class fileExceptionTest {
	public static void main(String[] args) throws Exception{
		System.out.println(System.getProperty("user.dir"));
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		char[] array = new char[50];
		try{
			fr.read(array);
			for(char c : array){
				System.out.print(c);
			}
		}catch(FileNotFoundException e){
			System.out.println("File " + file + " not found!");
		}catch(IOException f){
			System.out.println("IOException Error!");
		}finally{
			fr.close();
		}
		
	
		Scanner in = new Scanner(new FileReader(file));
		String text;
		System.out.print("\n\n");
		try{
			while ((text = in.nextLine()) != null){
				System.out.println(text);
				}
			}catch(NoSuchElementException e2){
				System.out.println("End of file/error");
			}catch(IllegalStateException e){
				System.out.println("Illegal state");
			}finally{
				in.close();
			}
		
		}
}
