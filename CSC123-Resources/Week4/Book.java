
public class Book {
	
	//here are my fields
	private static String publishingCompany="Pearson";
	private String ISBN;
	private int numberOfPages;
	private String authorName;
	private int amazonRank;
	private int bookReferenceNumber;
	private static int counter=100;
	
	//constructors
	
	public Book(String iSBN, String authorName) {
		ISBN = iSBN;
		this.authorName = authorName;
		this.bookReferenceNumber=counter++;
	}

	
	public Book(String iSBN, int numberOfPages, String authorName) {
		super();
		ISBN = iSBN;
		this.numberOfPages = numberOfPages;
		this.authorName = authorName;
	}

	public int getBookRef() {
		return this.bookReferenceNumber;
	}
	
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public static String getPublishingCompany() {
		return publishingCompany;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getAmazonRank() {
		return amazonRank;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", numberOfPages=" + numberOfPages + ", authorName=" + authorName
				+ ", amazonRank=" + amazonRank + "]";
	}
	
	public boolean equals(Object obj) {
		
		if(obj==null) return false;
		if(!obj.getClass().getName().equals(this.getClass().getName()))return false;
		Book other=(Book)obj;
		
		if(other.ISBN==this.ISBN) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	
	

}
