import java.util.Date;
import java.text.SimpleDateFormat;


public class DateParse {
	public static final String PATTERN="dd-MM-yy";
	public static void main(String[] args) {
		
		SimpleDateFormat df=new SimpleDateFormat(PATTERN);
		
		Date d2=df.parse("10-12-00");
		System.out.println(d2);
		
	}

}
