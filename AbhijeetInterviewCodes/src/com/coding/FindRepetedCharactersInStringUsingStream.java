package com.coding;

import java.util.Arrays;
import java.util.List;

public class FindRepetedCharactersInStringUsingStream {
	

	public static void main(String[] args) {
		String str = "sahilshahikantpawar";
		
		List<Integer> asList = Arrays.asList(1,2,3,4,3,2,5,4,2,1,6);
		
		 Integer count1 =(int) str.codePoints().filter(ch->ch=='a').count();
		
		long count2 = str.chars().filter(ch->ch=='s').count();
		
		long count3 = asList.stream().filter(s->s!=2).count();
		
		System.out.println("Count of char 's'- "+count1);
	
		System.out.println(count2);
		
		System.out.println(count3);
	}
}
