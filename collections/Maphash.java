package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Maphash {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Actor", "Mike");
		map.put("doctor", "david");
		map.put("ceo", "Carolyn");
		map.put("cto", "MMK");

		// System.out.println(map);
		// System.out.println(map.get("Actor"));
		Set<String> keys = map.keySet();

		for (String K : keys) {
			System.out.println(K);
		}

	}

}
