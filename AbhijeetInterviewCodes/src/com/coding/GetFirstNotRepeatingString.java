package com.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetFirstNotRepeatingString {
	public static void main(String[] args) {
		String str = "elephant";
		
		char[] charArray = str.toCharArray();
		
		List<Character> list = new ArrayList<>();
		
		for (Character character : charArray) {
			list.add(character);
		}
		System.out.println(list);
		
		Set<Character> s = new HashSet<>();
		//getting first repeating character
		list.stream().filter(t->!s.add(t)).limit(1).forEach(x->System.out.println(x));
		
		Map<Character, Integer> m = new LinkedHashMap<>();
		
		for (Character character : charArray) {
			Integer integer = m.get(character);
			
			if(integer==null) {
				m.put(character, 1);
			}
			else {
				m.put(character, integer+1);
			}
		}
		Character key = m.entrySet().stream().filter(v->v.getValue()==1).findFirst().get().getKey();
		
		
		
		
		
		System.out.println(key);
		
		
		
		
		
		
		
	}
}
