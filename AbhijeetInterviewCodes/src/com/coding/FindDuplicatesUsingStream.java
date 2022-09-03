package com.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindDuplicatesUsingStream {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,3,2,1,4,5,6,7,8);
		
		HashSet<Integer> hs = new HashSet<>();
		
		asList.stream().filter(t->!hs.add(t)).forEach(x->System.out.println(x));
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (Integer key : asList) {
			Integer value = hm.get(key);
			if(value==null) {
				hm.put(key, 1);
			}
			else {
				hm.put(key, value+1);
			}
		}
		System.out.println(hm);
		
		
	}
}
