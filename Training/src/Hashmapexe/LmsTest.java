package Hashmapexe;

import java.util.HashMap;
import java.util.Iterator;

public class LmsTest {

	public static void main(String[] args) {
		HashMap<Integer, String> studentDetails = new HashMap<>();
		studentDetails.put(587, "Purushothaman");
		studentDetails.put(587, "Hari Haran");
		studentDetails.put(137, "Raja");
		studentDetails.put(374, "Mark");
		// System.out.println(studentDetails.get(587));
		// studentDetails.remove(137);
		// TODO Auto-generated method stub
//		for (Integer i : studentDetails.keySet()) {
//			System.out.println(i);
//		}
//		for (String str : studentDetails.values()) {
//			System.out.println(str);
//		}
//studentDetails.forEach((k,v)->System.out.println(k+", "+v));
		
	//	Iterator<Integer>itr=studentDetails.keySet().iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		
		Iterator<String>itr=studentDetails.values().iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
