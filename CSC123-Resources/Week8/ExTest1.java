import java.text.SimpleDateFormat;

public class ExTest1 {

	public static void main(String[] args) {

		try {
		
			System.out.println(divide());
		}
		/*catch(ArithmeticException e) {
			
			System.out.println("Cannot divide by zero");
			
		}*/
		finally {
			System.out.println("I knew this was going to crash");
		}
		
		System.out.println("More code");
	}
	
	public static int divide() {
		return divide2();
	}

	public static int divide2() {
		return divide3();
	}
	
	public static int divide3() {
		return 2/0;
	}
}
