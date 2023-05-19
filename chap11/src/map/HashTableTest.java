package map;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<>();
		//동기화가 되어 멀티 스레드 환경에 안전,
		//null값을 key나 value 지원하지않음
		hashTable.put(null, null);
		hashTable.put("정한기", "늦잠");
		hashTable.put("김재린", "취업상담");
		hashTable.put("이하민","늦잠");
		hashTable.put("이하민","늦잠"); //에러 x
//		hashmap.put("이하민","병가"); 덮어씌워짐
		System.out.println(hashTable);
		hashTable.remove("이하민");
		System.out.println(hashTable);
	}

}
