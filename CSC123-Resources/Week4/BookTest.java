
public class BookTest {

	public static void main(String[] args) {
		
		//Object created (ref count = 1)
		Book animalFarm=new Book("1000-1000","George Orwell");
		
		//(ref count = 2)
		Book animalFarm2=animalFarm;
		
		//ref count=1
		animalFarm2=null;
		
		//ref count=0
		animalFarm=null;
		
		
		Book x=null;
		System.out.println(x.getAmazonRank());
		
		
	//	Book animalFarm=new Book("1000-1000","George Orwell");
		//Book animalFarm2=new Book(animalFarm);
		
	
	}
}
