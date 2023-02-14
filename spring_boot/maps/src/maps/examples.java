package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class examples {
		public static void main(String[] args) {
			
			//Navigable sets are additional functionalities of the lists
			//Hash always that is that word is unordered and un sortered.
			//Linkend always ordered like is inserted.
			//TreeSet always sorted on natural order and have Navigable sets.
				
			//Maps are using to define a list of Key-Value
			// HashMap, unsorted, unordered, Allow a key with null value
			HashMap<String, Integer> hashmap = new HashMap<>();
			hashmap.put("A", 32);
			hashmap.put("Z", 12);
			hashmap.put("B", 200);
			hashmap.put("H", 45);
			System.out.println(hashmap);
			
			//LinkedHashMap
			//faster interaction, slower insertion and deletion
			//insertion order is maintened
			LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
			linkedHashMap.put("A", 32);
			linkedHashMap.put("Z", 12);
			linkedHashMap.put("B", 200);
			System.out.println(linkedHashMap);
			
			
			//TreeMap
			//sorted order is maintained always, implements navigable map 
			TreeMap<String, Integer> treemap = new TreeMap<>();
			treemap.put("A", 32);
			treemap.put("Z", 12);
			treemap.put("B", 200);
			//Some operations that is not on other maps
			treemap.higherKey("B"); //saw the next one to B
			treemap.ceilingKey("B"); //saw the next one to B or equal
			treemap.lowerKey("B"); //saw the low one to B 
			treemap.floorKey("B"); //saw the low one to B or equal
			treemap.firstEntry(); // saw the firts entry
			treemap.lastEntry(); // saw the last entry
			treemap.subMap("A", "Z"); // saw the entries between them.
			treemap.subMap("A", true, "Z", true); // saw the entries between them and with true include the mencionated.
			System.out.println(treemap);
			
			//HashTable
			//Syncronizhed, theat safe, unsorted, unorderer
			//Not Allow a key with null value
			
			//Examples of operations, key, value, think well of the type of it.
			//Map is inmutable 
			Map<String,Integer> map = Map.of("A",3,"B", 5, "Z", 10);
			System.out.println(map.get("Z"));
			System.out.println(map.get("H")); //H doesnt exists, null value.
			System.out.println(map.size()); //Size in number
			System.out.println(map.isEmpty()); //Empty true or false
			System.out.println(map.containsKey("A")); //Searching for a Key
			System.out.println(map.containsValue(10)); //Searching for a value
			System.out.println(map.keySet()); //List all keys
			System.out.println(map.values()); //List all values
			
			Map<String,Integer> hashmapcopy = new HashMap<>(map); //Create a HasMap from Map List
			hashmapcopy.put("J", 5); //Create if not exists and updated value if exists
		}
}
