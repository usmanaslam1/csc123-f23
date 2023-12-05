
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.io.Reader;

public class NetworkReader3 {

	
	static Map<String, Currency> worldCurrencies=new TreeMap<String, Currency>();

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
			
			Currency cur=new Currency(currencyLine[0],
					          currencyLine[1],
					          Double.parseDouble(currencyLine[2]));
			
			
			worldCurrencies.put(cur.getCurrencyCode(), cur);
			
			

		}
		
		System.out.println(convertToUSD("GBP",100));
		
		
		
	}
	
	public static double convertToUSD(String code, double amount) {
		
		return worldCurrencies.get(code).convertToUSD(amount);
	}
	

}
