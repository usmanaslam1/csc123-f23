import java.util.Scanner;

public class EmailTest {

	public static void main(String[] args) {

		EmailAddress email = null;
		while (true) {
			try {
				System.out.print("\nEnter Email Address :");
				Scanner kb = new Scanner(System.in);
				email = new EmailAddress(kb.nextLine());
				break;
			} catch (InvalidEmailAddressException e2) {
				System.out.println("Invalid email address");
			} catch (BannedEmailProviderException be) {
				System.out.println(be.getMessage()+" is a banned email provider");
			}
		}

		System.out.println("\nYour email address is: "+email);
	}

}
