package java_code;

import java.util.HashMap;

public class Hashing {
	public HashMap<Integer, Student> buildHashMap(Student[] students){
		HashMap<Integer, Student> hashmap = new HashMap<Integer,Student>();
		for(Student s : students) {
			hashmap.put(s.getId(),s);
			
		}
		return hashmap;
	}
}
