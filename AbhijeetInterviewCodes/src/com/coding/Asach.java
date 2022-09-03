package com.coding;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Asach {
	public static void main(String[] args) {

		List<Kahitari> collect = Stream.of(new Kahitari(1, "sahil", 26, "male", "mechanical", 100000),
				new Kahitari(102, "abhijeet", 26, "male", "computer", 2600),
				new Kahitari(105, "jaggu", 27, "male", "computer", 2600),
				new Kahitari(106, "aniket", 22, "male", "entc", 14000),
				new Kahitari(106, "aniket", 22, "male", "entc", 14000),
				new Kahitari(107, "shamali", 21, "female", "computer", 26000)).collect(Collectors.toList());
		
		String string = collect.stream().filter(d->d.getDepartment().contentEquals("computer")).map(Kahitari::getName).max(Comparator.comparing(String::length)).get();
		
		System.out.println(string);
		
		collect.stream().sorted((i,j)->j.getSalary()-i.getSalary()).limit(1).forEach(x->System.out.println(x));
		
		Map<String, List<Kahitari>> collect2 = collect.stream().collect(Collectors.groupingBy(Kahitari::getDepartment,Collectors.toList()));
		
		System.out.println(collect2);
		
		
		//System.out.println(collect2);
		
		
		
	}
}

class Kahitari {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Kahitari(int id, String name, int age, String gender, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
	}

	public Kahitari() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", salary=" + salary + "]";
	}

}
