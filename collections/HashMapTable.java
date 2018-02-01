package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapTable {

	public static void main(String[] args) {
    
		Map<String,String> H = new Hashtable<>();
		H.put("1", "one");
		H.put("2", "Two");
		H.put("3", "Threee");
		H.put("4", "Four");
		
		Set <String> keys = H.keySet();
		
		for (String key : keys)
		System.out.println(key);
	}

}
