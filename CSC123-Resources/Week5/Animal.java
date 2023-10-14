
public  class Animal extends Object{
	
	String name;
	String animalType;
	String color;
	
	
	public Animal(String name, String animalType,String color) {
		this.name = name;
		this.animalType = animalType;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAnimalType() {
		return "TYPE IS: "+animalType;
	}


	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", animalType=" + animalType + ", color=" + color + "]";
	}





	
	

}
