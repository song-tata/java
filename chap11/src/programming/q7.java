package programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q7 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();
		
		String[] s1 = {"a","b","c","a","b"};
		String[] s2 = {"c"};
		Integer[] s3 = {1,2,3,4,5,6,8};
		
		set3.addAll(Arrays.asList(s3));
 		
		set1.addAll(Arrays.asList(s1));
		set2.addAll(Arrays.asList(s2));
	}

}
