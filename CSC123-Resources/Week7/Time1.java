import java.text.SimpleDateFormat;
import java.util.Date;
public class Time1 {
	
	static final long DATE_TO_YEARS_FACTOR=(long)(1000/60/60/24/365);
	
	public static void main(String[] args) throws Exception {
		
		
		System.out.println(getAge("12/19/1943"));
		
		
		
	}
	
	private static long getAge(String date) throws Exception{
		SimpleDateFormat df=new SimpleDateFormat("MM/DD/YYYY");
		Date dob=df.parse(date); //Date of birth
 		Date today=new Date(); //today's date
		
 		//DOB milliseconds since 1970
		long dobInMilliseconds=dob.getTime();
		
		//Today's date, milliseconds since 1970
		long todayInMilliseconds=today.getTime();
		
		//Difference between today's date and DOB,  person's age in milliseconds 
		long delta=todayInMilliseconds-dobInMilliseconds;
		
		//Person's age in years
		long age=delta/DATE_TO_YEARS_FACTOR;
		
		return age;
	}
}













