package com.coding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class FindDuplicateKeyFromHashMap {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "Sahil");
		m.put(5, "Sahil");
		m.put(3, "BappiBhai");
		m.put(2, "PappiBhai");
		m.put(4, "Bappibhai");
		
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		
		List<Entry<Integer,String>> collect = entrySet.stream().sorted((i,j)->i.getValue().compareTo(j.getValue())).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
