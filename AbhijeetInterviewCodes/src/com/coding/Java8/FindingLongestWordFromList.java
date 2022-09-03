package com.coding.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindingLongestWordFromList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sahil","Pankaj","Anirudh","Abhijeet","Jagdish");
		
		String string = list.stream().max(Comparator.comparing(String::length)).get();
		
		System.out.println(string);
		
		
		
		
	}
}
