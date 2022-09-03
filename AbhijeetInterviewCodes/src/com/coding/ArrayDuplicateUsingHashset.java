package com.coding;

import java.util.HashMap;
import java.util.List;

public class ArrayDuplicateUsingHashset {

	public static void main(String[] args) {
		
		String str="sahilshahikantpawar";
		
		
		char[] charArray = str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for (char string : charArray) {
			Integer integer = hm.get(string);
			
			if(integer==null) {
				hm.put(string, 1);
			}else {
				hm.put(string, integer+1);
			}
		}
		System.out.println(hm);
	}
}
