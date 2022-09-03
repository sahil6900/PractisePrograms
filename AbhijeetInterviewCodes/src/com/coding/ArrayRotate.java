package com.coding;

import java.util.Arrays;

public class ArrayRotate {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		
		int[] arr1 = new int[arr.length];
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < arr.length; i++) {
				if(i==arr.length-1) {
					arr1[arr.length-1-i]=arr[i];
				}
				else {
					arr1[i+1]=arr[i];
				}
			}
			for (int i = 0; i < arr1.length; i++) {
				arr[i]=arr1[i];
			}
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}
