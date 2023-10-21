//Read all bytes using a equal sized buffer

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader2 {
	
	public static void main(String[] args) {
		File myFile=new File("/Users/usman/abc.txt");
		
		try {
			FileInputStream in=new FileInputStream(myFile);
			int available=in.available();
			
			byte[] buffer=new byte[available];
			in.read(buffer);
			
			for (byte b: buffer) {
				System.out.println(b);
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
