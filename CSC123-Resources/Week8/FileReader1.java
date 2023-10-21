//Read one byte at a time

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader1 {
	
	public static void main(String[] args) {
		File myFile=new File("/Users/usman/abc.txt");
		
		try {
			FileInputStream in=new FileInputStream(myFile);
			int available=in.available();
			
			for(int x=0;x<available;x++) {
				
				int b=in.read();
				
				System.out.println(b+" : "+(char)b);
				
			}
			
			
	
		}
		catch(FileNotFoundException fne) {
			System.out.println("File not found!!");
		}
		catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
		
		
		
	}

}
