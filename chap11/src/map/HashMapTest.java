package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> hashmap = new HashMap<>();
		//동기화가 되어있지 않아 멀티쓰레드 환경에 안전하지 않음.
		//요소 추가
		hashmap.put("정한기", "늦잠");
		hashmap.put("김재린", "취업상담");
		hashmap.put("이하민","늦잠");
		hashmap.put("이하민","늦잠"); //에러 x
//		hashmap.put("이하민","병가"); 덮어씌워짐
		System.out.println(hashmap);
		hashmap.remove("이하민");
		System.out.println(hashmap);
		
		for(Entry<String, String> s : hashmap.entrySet()) {
			String key = s.getKey();
			String value = s.getValue();
			System.out.println(key + ":"+value);
		}
	}

}
