package adapter_wrapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//the demo followed is typical adapter model;
			
		FileInputStream fis = new FileInputStream("c:/test/text");
		
		//the InputStreamReader is adapter between FileInputStream and BufferedReader;
		InputStreamReader isr = new InputStreamReader(fis);
		
		//BufferedReader just can receive InputStreamReader
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		while(line != null && !line.equals("")) {
			System.out.println(line);
		}
		
		br.close();
	}

}
