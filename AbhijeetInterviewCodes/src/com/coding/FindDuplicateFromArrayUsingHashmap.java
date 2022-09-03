package com.coding;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateFromArrayUsingHashmap {
	public static void main(String[] args) {		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(2);
		hs.add(5);
		hs.add(4);
		hs.add(2);
		hs.add(1);
		
		List<Integer> collect = hs.stream().collect(Collectors.toList());
		
		
		System.out.println(collect);
	}
}
