package com.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsingComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Persons1> list = new ArrayList<>();
		list.add(new Persons1(1,"sahil"));
		list.add(new Persons1(4,"pankaj"));
		list.add(new Persons1(2,"abhi"));
		list.add(new Persons1(3,"aniket"));
		list.add(new Persons1(2,"ankit"));
		
		Collections.sort(list,new SortingUsingId());
		
		System.out.println(list);
		
		Collections.sort(list,new SortUsingName());
		
		System.out.println(list);
	}
}
class Persons1 {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Persons1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Persons1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persons [id=" + id + ", name=" + name + "]";
	}
}
class SortUsingName implements Comparator<Persons1>{

	@Override
	public int compare(Persons1 o1, Persons1 o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
class SortingUsingId implements Comparator<Persons1>{

	@Override
	public int compare(Persons1 o1, Persons1 o2) {
		if(o1.getId()==o2.getId()) {
			return 1;
		}
		if (o1.getId()<o2.getId()) {
			return -1;
		}
		return 0;
	}
	
}

