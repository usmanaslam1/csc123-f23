import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {
	public static void main(String[] args) {
		
		Map<String, String> studentJoe=new TreeMap<String, String>();
		Map<String, String> studentJames=new HashMap<String, String>();
		Map<String, String> studentJane=new HashMap<String, String>();
		
		ArrayList<Map> students=new ArrayList<Map>();
		
		
//		//Dictionary
		studentJoe.put("Name", "Joe");
		studentJoe.put("Age", "15");
		studentJoe.put("GPA", "4");
		studentJoe.put("City", "Carson");
		studentJoe.put("Sports", "Hockey, Football");
		studentJoe.put("Subjects", "Computers, Networks");
		
		
	//	studentJoe.put("GPA", "238");
		
		System.out.println(studentJoe.get("GPA"));
		
		Set keys=studentJoe.keySet();
		Collection c=studentJoe.values();		
		
		for(Object o: keys) {
			System.out.println(o);
		}
		
		
		System.exit(0);
		
		
		
		
		
		
		
		
		
		
//		Set keys=studentJoe.keySet();
//		
//		
//		for(String key:studentJoe.keySet()) {
//			
//			System.out.println(key);
//		}
//		
//		
//		for(String value:studentJoe.values()) {
//			System.out.println(value);
//		}
//		
//
//		
//		
/////		//Dictionary
//		studentJane.put("Name", "Jane");
//		studentJane.put("Age", "20");
//		studentJane.put("GPA", "4");
//				
//		
//////		//Dictionary
//		studentJames.put("Name", "James");
//		studentJames.put("Age", "21");
//		studentJames.put("GPA", "3.9");
//						
//		
//		students.add(studentJoe);
//		students.add(studentJane);
//		students.add(studentJames);
////		
////		
////		
//		System.out.println(students);
	}
}
