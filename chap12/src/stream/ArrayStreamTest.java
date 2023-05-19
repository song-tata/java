package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamTest {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		Arrays.stream(arr1).forEach(n -> System.out.println(n));
		Arrays.stream(arr1).forEach(System.out::println);
		
		for(int i : arr2) {
			System.out.println(i);
		}
			int sum = Arrays.stream(arr2).sum();
			System.out.println(sum);
			
			List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
//			list.add(3);
//			list.add(4);
			System.out.println(list);
		
	}

}
