
public class TestDog {

	public static void main(String[] args) {
		Owner owner=new Owner("Camila",'F');
		
		Dog dog1=new Dog("Snoopy", "Beagle", 10, "White");
		Dog dog2=new Dog("Pluto", "Bloodhound", 10, "White");
		Dog dog3=new Dog("Scooby Doo", "Great Dane", 10, "White");
		
		dog1.setOwner(owner);
		dog2.setOwner(owner);
		dog3.setOwner(owner);
		
		System.out.println(owner);
	}

}
