import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormat1 {

	public static void main(String[] args) {
		
		Date present=new Date();
		SimpleDateFormat df=new SimpleDateFormat();
		System.out.println(df.format(present));
		
		Date current=new Date(0);
		System.out.println(df.format(current));
		

	}

}
