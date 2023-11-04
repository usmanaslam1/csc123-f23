import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		String data="Some new informatiojn.... This is some data that I want to write into a file!!";
	
		String sourceFile="/Users/usman/input.txt";
		String targetFile="/Users/usman/output.txt";
		
		
		File sf=new File(sourceFile);
		File tf=new File(targetFile);
		
		try {
	
				
			//READING
			FileInputStream in=new FileInputStream(sf);
			FileOutputStream out=new FileOutputStream(tf);

			int available=in.available();
			
			byte[] buffer=new byte[available];
			in.read(buffer);
			
		
			//WRITING
			tf.createNewFile();//Create new file
			
			
			out.write(buffer);
			out.flush();

	
		}
		catch(FileNotFoundException fne) {
			System.out.println("File not found!!");
		}
		catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		

		
	
	}
}
