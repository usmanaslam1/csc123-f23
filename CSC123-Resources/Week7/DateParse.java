import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DateParse {
	public static final String PATTERN="dd-MM-yy";
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat df=new SimpleDateFormat(PATTERN);
		
		try {
			
			Date d2=df.parse("10-12hj-00");
			System.out.println(d2);
		}
		
		finally{
			System.out.println("oooppps!!");
		}

		
		
		
	}

}
