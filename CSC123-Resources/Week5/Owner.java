import java.util.Objects;

public class Owner {
	String name;
	char gender;
	
	Dog pet;
	
	public Owner(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public void setPet(Dog pet) {
		this.pet=pet;
		if(pet.getOwner()==null) {
			pet.setOwner(this);
		}
	}
	
	public Dog getPet() {
		return this.pet;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gender, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		return gender == other.gender && Objects.equals(name, other.name);
	}

	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", gender=" + gender + ", pet=" + pet.name + "]";
	}
	
	
}
