
public class BookTest2 {

	public static void main(String[] args) {
	
		Book animalFarm=new Book("1000-1000","George Orwell");
		Book animalFarm2=new Book("1000-1000","George Orwell");
		
		if(animalFarm.equals(animalFarm2)) {
			System.out.println("Matched!");
		}
		
	}

}
