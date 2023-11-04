import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
	public static void main(String[] args) {
		
		Map<String, Object> studentJoe=new HashMap<String, Object>();
		Map<String, Object> studentJames=new HashMap<String, Object>();
		Map<String, Object> studentJane=new HashMap<String, Object>();
		
		ArrayList<Map> students=new ArrayList<Map>();
		
		
//		//Dictionary
		
		ArrayList<String> joesHobbies=new ArrayList<String>();
		
		joesHobbies.add("Hiking");
		joesHobbies.add("Spear Fishing");
		
		studentJoe.put("Name", "Joe");
		studentJoe.put("Age", 15);
		studentJoe.put("GPA", 5);
		studentJoe.put("Hobbies", joesHobbies);

	
		
		
///		//Dictionary
		
		ArrayList<String> janesHobbies=new ArrayList<String>();
		
		janesHobbies.add("Soccer");
		janesHobbies.add("Running");

		studentJane.put("Name", "Jane");
		studentJane.put("Age", "20");
		studentJane.put("GPA", "4");
		studentJane.put("Hobbies",janesHobbies);
		
////		//Dictionary
		studentJames.put("Name", "James");
		studentJames.put("Age", "21");
		studentJames.put("GPA", "3.9");
						
		
		students.add(studentJoe);
		students.add(studentJane);
		students.add(studentJames);
//		
//		
//		
		System.out.println(students);
	}
}
