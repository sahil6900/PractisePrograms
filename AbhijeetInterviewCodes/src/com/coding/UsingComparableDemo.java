package com.coding;

import java.util.ArrayList;
import java.util.Collections;

public class UsingComparableDemo {
	public static void main(String[] args) {
		Persons p = new Persons(1,"sahil");
		Persons p1 = new Persons(3,"adi");
		Persons p2 = new Persons(4,"abhi");
		Persons p3 = new Persons(2,"pankaj");
		
		ArrayList<Persons> list = new ArrayList<>();
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
	}
}
class Persons implements Comparable<Persons>{
	private int id;
	private String name;
	
	@Override
	public int compareTo(Persons o) {
		
		return this.id-o.id;
	}
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
	public Persons(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persons [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
