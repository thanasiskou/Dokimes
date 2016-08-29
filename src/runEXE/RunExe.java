package runEXE;

import java.io.IOException;
import java.util.Scanner;

public class RunExe {
	
	public static final int instance_limit = 10;
	
	public static void main(String[] args){
		String str = "C:\\Program Files (x86)\\K-Lite Codec Pack\\MPC-HC64\\mpc-hc64.exe";
		int instances = 0;
		int instance_limit = 10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Media Player Classic 64bit");
		System.out.println("Executable path: " + str);
		System.out.print("Run times: ");
		try{
			if((instances = scanner.nextInt()) <= instance_limit){
				//System.out.println("instances = " + instances);
				for(int i = 0; i < instances; i++){
					Process p = Runtime.getRuntime().exec(str);
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
