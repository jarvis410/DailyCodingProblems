package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem33 {

	/**
	 * print running median [2, 1, 5, 7, 2, 0, 5] - input
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Integer input[] = { 2, 1, 5, 7, 2, 0, 5 };

		for (int i = 0; i < input.length; i++) {
			List<Integer> arr = Arrays.asList(input) // to list
					.subList(0, i + 1); // to sublist
			
			printMedian(arr);
		}
	}
	
	public static void printMedian(List<Integer> array) {
		int length = array.size();
		int mid = length / 2;
		double median = 0;
		
		Collections.sort(array);
		
		if((length & 1) == 0) {
			median = (double)(array.get(mid) + array.get(mid-1)) / 2;
		} else {
			median = array.get(mid);
		}
		
		System.out.println(median);
	}

}
