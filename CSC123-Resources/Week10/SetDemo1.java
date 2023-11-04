import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
	
	public static void main(String[] args) {
		
		Set<String> fruits=new TreeSet<String>();
		
		fruits.add("Orange");
		fruits.add("Strawberry");
		fruits.add("Banana");
		fruits.add("Orange");
		
		for(String item:fruits) {
			System.out.println(item);
		}
	}
	

}
