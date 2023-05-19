package programming;

import java.util.HashMap;
import java.util.Map.Entry;

public class Six {

	public static void main(String[] args) {
		HashMap<String, String> animals = new HashMap<>();
		animals.put("호랑이", "tiger");
		animals.put("표범", "leopard");
		animals.put("사자", "lion");
		
		System.out.println(animals);
//		for(Entry<String, String> s : animals.entrySet()) {
//			String key = s.getKey();
//			String value = s.getValue();
//			animals.replace(key, value.toUpperCase());
//		}
		animals.replaceAll((k,v)->v.toUpperCase());
		System.out.println(animals);
	}

}
