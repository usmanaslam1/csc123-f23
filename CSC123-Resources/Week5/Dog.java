import java.util.Objects;

public class Dog {
	
	String name;
	String breed;
	int age;
	String color;
	Owner owner;
	
	
	public Dog(String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public void setOwner(Owner o) {
		this.owner=o;
		if(o.getPet()==null) {
			o.setPet(this);
		}
	}
	
	public Owner getOwner() {
		return this.owner;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}




	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + ", owner=" + owner.name
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, breed, color, name);
	}






	
	

}
