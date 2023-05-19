package programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Seven {

	public static void main(String[] args) {
		String[] s1 = {"a","b","c","a","b"};
		String[] s2 = {"c"};
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		set1.addAll(Arrays.asList(s1));
		System.out.println(set1);
		set2.addAll(Arrays.asList(s2));
		System.out.println(set2);
		System.out.println(set1.equals(set2));
		
		//합집합
		set1.addAll(set2);
		System.out.println(set1);
		
		Set<String> intersection = new HashSet<>();
		for(String s : set1) {
			for(String t: set2) {
				if(s.equals(t)) {
					intersection.add(s);
					break;
				}
			}
		}
		
	}

}
