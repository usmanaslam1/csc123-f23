import java.util.Date;
import java.text.SimpleDateFormat;


public class DateFormat2 {
	public static final String PATTERN="MM-dd-yy";
	public static void main(String[] args) throws Exception{
		
		String sDate="10-14-ajgo22";
		SimpleDateFormat df=new SimpleDateFormat(PATTERN);
		
		Date userDate=df.parse(sDate);
		System.out.println(userDate);
		

	}

}
