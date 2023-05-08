package testfile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class sort1 {

	List<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);
	        numbers.add(6);

	        // 리스트 오름차순 정렬
	        Collections.sort(numbers);

	        // 정렬된 리스트 출력
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	   


}
