package runComms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RunComms {
	public static void main(String[] args){
		//taskManager();
		String str[] = {
				"C:\\Program Files (x86)\\Skype\\Phone\\Skype.exe",
				"C:\\Programs\\TeamSpeak 3\\ts3client_win64.exe",
				"C:\\Games\\Steam\\Steam.exe",
				"C:\\Program Files (x86)\\Battle.net\\Battle.net Launcher.exe"};
		String str2[] = {
				"Skype.exe",
				"ts3client_win64.exe",
				"Steam.exe",
				"Battle.net.exe"};
		try{
			PrintWriter writer = new PrintWriter("CommsLog.txt","UTF-8");
			for(int i = 0; i < str.length; i++){//Run applications that need elevation
				System.out.print("Executing: " + str2[i]);
				writer.print("Executing: " + str2[i]);
				if(isRunning(str2[i])){
					System.out.println(" Already running");
					writer.println(" Already running");
				}else{
					Runtime.getRuntime().exec("cmd /c \"" + str[i] + "\"");
					Thread.sleep(1000);
					if(isRunning(str2[i])){
						System.out.println(" Success");
						writer.println(" Success");
					}else{
						System.out.println(" Failed");
						writer.println(" Failed");
					}
				}
			}
			writer.close();
			printTaskManager();
			Thread.sleep(1000);
		}catch(IOException e){
			e.printStackTrace();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public static boolean isRunning(String str){
		try{
			String line;
		    Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
		    BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

		    line = input.readLine(); line = input.readLine();line = input.readLine();
		    while ((line = input.readLine()) != null) {
		    	//System.out.println(line); //<-- Parse data here.
		    	if(line.substring(0,str.length()).equals(str)){
		    		input.close();
		    		return true;
		    	}
		    }
		    input.close();
		    return false;
		}catch (Exception e) {
		    e.printStackTrace();
		    return false;
		}
		
	}
	
	public static void taskManager(){
		try{
			String line;
		    Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
		    BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    line = input.readLine();line = input.readLine();line = input.readLine();
		    while ((line = input.readLine()) != null) {
		    	System.out.println(line);
		    }
		    input.close();
		    return;
		}catch (Exception e) {
		    e.printStackTrace();
		    return;
		}
	}
	
	public static void printTaskManager(){
		BufferedWriter out = null;
		try{
			FileWriter output = new FileWriter("CommsLog.txt", true); //true tells to append data.
		    out = new BufferedWriter(output);
		    
		    String line;
		    Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
		    BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    while ((line = input.readLine()) != null) {
		    	out.write(line + "\n");
		    }
		    out.write("\n");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(out != null){
				try{
					out.close();
				}catch(IOException e){
					e.printStackTrace();
					}
				}
			} 
		}
}
