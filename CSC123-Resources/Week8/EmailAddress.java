
public class EmailAddress {
	private String email;
	
	public EmailAddress(String email) throws InvalidEmailAddressException, BannedEmailProviderException {
		if(email.indexOf("@")>-1&&email.indexOf(".")>-1) {
			this.email=email;
		}
		else {
			throw new InvalidEmailAddressException("Invalid email address!");
		}
		
		if(email.indexOf("hotmail")>-1) {
			throw new BannedEmailProviderException("hotmail");
		}
		
	}
	
	public String toString() {
		return email;
	}
	
}
