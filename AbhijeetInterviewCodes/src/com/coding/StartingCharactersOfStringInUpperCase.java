package com.coding;

import java.util.StringTokenizer;

public class StartingCharactersOfStringInUpperCase {
	public static void main(String[] args) {
		String str = "i love my india";
		
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			String substring = split[i].substring(0, 1);
			
			String substring2 = split[i].substring(1, split[i].length());
			
			String upperCase = substring.toUpperCase();
			
			System.out.print(upperCase+substring2 +" ");
			
			
		}System.out.println("---------------------------------------");
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			
			String substring = nextToken.substring(0, 1);
			
			String substring2 = nextToken.substring(1, nextToken.length());
			
			String upperCase = substring.toUpperCase();
			
			System.out.println(upperCase+substring2);
		}
	}
}
