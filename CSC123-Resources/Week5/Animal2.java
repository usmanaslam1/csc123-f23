
public class Animal2 extends Animal{
	
	String sound;
	public Animal2(String name, String type, String color) {
		super(name,type,color);
	}
	
	public void setSound(String sound) {
		this.sound=sound;
	}
	
	public String getSound() {
		return this.sound;
	}
	
	@Override
	public String getName() {
		return "NAME IS: " + super.getName();
	}
}
