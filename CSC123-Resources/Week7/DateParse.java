import java.util.Date;
import java.text.SimpleDateFormat;


public class DateParse {
	public static final String PATTERN="MMMM, dd, yyyy public static final String PATTERN=\"dd-mm-yyyy\"; HH:mm:ss";
	public static void main(String[] args) {
		
		Date present=new Date();
		SimpleDateFormat df=new SimpleDateFormat(PATTERN);
		System.out.println(df.format(present));
		
		Date current=new Date(0);
		System.out.println(df.format(current));
		

	}

}
