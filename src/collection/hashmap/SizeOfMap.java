// 2. Write a Java program to count the number of key-value (size) mappings in a map.

package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SizeOfMap {

	public static void main(String[] args) {
		
		Map<String, String> heros = new HashMap<>();
		
		heros.put("Iron Man", "Marvel");
		heros.put("Avengers", "Marvel");
		heros.put("Dark Knight", "DC");
		heros.put(null, null);
		
		System.out.println(heros);
		System.out.println("Size: " + getSizeOfMap(heros));

	}
	
	public static <K,V> int getSizeOfMap(Map<K,V> map) {
		return map.size();
	}

}
