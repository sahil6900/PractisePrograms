package com.coding.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReverseStringUsingStream {
	public static void main(String[] args) {
		String str = "Love My Country";
		
		String[] split = str.split(" ");
		
		List<String> list = new ArrayList<>();
		
		for (String string : split) {
			boolean add = list.add(string);
		}
		
		System.out.println(list);
		
		
		List<String> collect = list.stream().map(word->new StringBuffer(word).reverse().toString()).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
	list.stream().map(String::length).max(Integer::compare);
	
	
		
		String string = Arrays.stream(split).max(Comparator.comparing(String::length)).get();
		
		System.out.println(string);
		

	}
}
