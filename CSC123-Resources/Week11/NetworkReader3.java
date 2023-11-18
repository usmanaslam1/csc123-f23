
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.io.Reader;

public class NetworkReader3 {

	public static void main(String[] args) throws Exception{
		

		Socket client=new Socket("www.usman.cloud",80);
		
		
		OutputStream out=client.getOutputStream();
		InputStream in=client.getInputStream();
		
		//Sending reqeust to Google
		String request="GET /exchange-rate.csv \r\n";
		out.write(request.getBytes());
		//This will read all bytes at once
		
		Reader r=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(r);
		
		String line;
		while((line=br.readLine())!=null) {
			String[] currencyLine=line.split(",");
			System.out.println("CURRENCY CODE: "+currencyLine[0]);
			System.out.println("COUNTRY: "+currencyLine[1]);
			System.out.println("RATE: "+currencyLine[2]);
			
		}
		
		
	}

}
