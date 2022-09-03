package com.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GetBooleanValueForDuplicate {
	public static void main(String[] args) {
		String[] string = {"sahil","pankaj","abhijeet",
				"akash","sahil","sahil","abhijeet"};
		
		
		
		for (int i = 0; i < string.length; i++) {
			int count = 0;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j]) {
					count++;
					string[i] = "true";
				}
			}
		}
		System.out.println(Arrays.toString(string));

		List<String> names = Arrays.asList("sahil", "pankaj", "abhijeet", "akash", "sahil", "sahil", "abhijeet");

		Set<String> duplicates = names.stream().filter(t->Collections.frequency(names, t)>1).collect(Collectors.toSet());		
		System.out.println(duplicates);
		
		Set<String> dupNames = new HashSet<>();
		
		Set<String> collect = names.stream().filter(e->!dupNames.add(e)).collect(Collectors.toSet());
		
		System.out.println(collect);
		
		long count = names.stream().filter(e->(String)e=="sahil").count();
		
		System.out.println(count);
		
	
		
	}
}
