package com.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheSecondLargestNumberFromList {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		asList.stream().sorted(Collections.reverseOrder()).limit(3).skip(2).forEach(x->System.out.println(x));
	}
}
