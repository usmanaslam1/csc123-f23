import java.io.File;

public class MyFile1 {

	public static void main(String[] args) {
		
		File myFile=new File("/Users/usman/abc.txt");
		
		System.out.println(myFile.exists());
		System.out.println(myFile.canRead());
		System.out.println(myFile.canWrite());
		System.out.println(myFile.canExecute());
		System.out.println(myFile.isDirectory());
		
		
		File[] files=myFile.listFiles();
		
		for (File f:files) {
			System.out.println("Deleting ... "+f.getName());
		}
		
		
		
		
		

	}

}
