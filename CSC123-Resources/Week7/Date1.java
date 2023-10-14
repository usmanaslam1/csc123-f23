import java.util.Date;
public class Date1 {

	public static void main(String[] args) {
		
		Date present=new Date();
		
		Date past=new Date(System.currentTimeMillis()-1000000);
		
		
		if(present.before(past)) {
			System.out.println("We are time travelling");
		}
		else {
			System.out.println("We are NOT time travelling");
		}
		

	}

}
