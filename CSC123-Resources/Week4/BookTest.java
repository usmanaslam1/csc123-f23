
public class BookTest {

	public static void main(String[] args) {
		
		//Object createnimalFarm=new Book("1000-1000","George Orwell");
		Book book1=new Book("1000-1000","George Orwell");
		Book book2=new Book("1000-1000","George Orwell");
		Book book3=new Book("1000-1000","George Orwell");
		
		System.out.println(book1.getBookRef());
		System.out.println(book2.getBookRef());
		System.out.println(book3.getBookRef());
	}
}
