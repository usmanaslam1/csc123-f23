
public class TestDog {

	public static void main(String[] args) {
		Owner owner=new Owner("Camila",'F');
		Dog puppyDog=new Dog("Snoopy","Beagle",4,"White");

		puppyDog.setOwner(owner);
		
		System.out.println(owner.getPet());
		
		
	}

}
