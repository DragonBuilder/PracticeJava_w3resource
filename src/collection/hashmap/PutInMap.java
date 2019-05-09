// 1. Write a Java program to associate the specified value with the specified key in a HashMap.

package collection.hashmap;

import java.util.*;

public class PutInMap {

	public static void main(String[] args) {
		
		Map<String, String> heros = new HashMap<>();
		
		putInMap(heros, "Iron Man", "Marvel");
		putInMap(heros, "Avengers", "Marvel");
		putInMap(heros, "Dark Knight", "DC");
		putInMap(heros, null, null);
		
		System.out.println(heros);

	}
	
	/**
	 * Associates the value with key and puts it into map.
	 * @param map
	 * @param key
	 * @param value
	 */
	public static <K,V> void putInMap(Map<K,V> map, K key, V value) {
		map.put(key, value);
	}

}
