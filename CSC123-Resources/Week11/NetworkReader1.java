
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class NetworkReader1 {

	public static void main(String[] args) throws Exception{
		

		Socket client=new Socket("www.google.com",80);
		
		
		OutputStream out=client.getOutputStream();
		InputStream in=client.getInputStream();
		
		//Sending reqeust to Google
		String request="GET / \r\n";
		out.write(request.getBytes());
		
				
		
		//reading response from Google
		byte b;
		while((b=(byte)in.read())!=-1) {
			System.out.println((char)b);
		}
				
	}

}
