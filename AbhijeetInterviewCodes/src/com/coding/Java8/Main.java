package com.coding.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(new Employee(101, "pankaj gote", 21, "male", "mechanical", 1000),
				new Employee(102, "abhijeet", 26, "male", "computer", 2600),
				new Employee(103, "sahil", 25, "male", "mechanical", 15000),
				new Employee(105, "jaggu", 27, "male", "computer", 2600),
				new Employee(106, "aniket", 22, "male", "entc", 14000),
				new Employee(107, "shamali", 21, "female", "computer", 26000),
				new Employee(104, "rutuja", 20, "female", "entc", 19000),
				new Employee(108, "ganesh", 21, "male", "computer", 18000),
				new Employee(109, "shital", 25, "female", "mechanical", 35000),
				new Employee(202, "namrata", 24, "female", "computer", 2600),
				new Employee(204, "swarup", 16, "male", "computer", 14555),
				new Employee(206, "prajwal", 35, "male", "computer", 40000),
				new Employee(208, "harsh", 34, "male", "mechanical", 2600),
				new Employee(205, "rushi", 22, "male", "computer", 60000),
				new Employee(209, "abhi", 14, "male", "entc", 2600)
				
				);
		
		Map<Integer, Long> collect4 = list.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting()));
		
		System.out.println(collect4);
		
		//count of males
		long count = list.stream().filter(e->e.getGender().contentEquals("male")).count();
		System.out.println("Count of males - "+count);
		
		//count of females
		long count1 = list.stream().filter(e->e.getGender().contentEquals("female")).count();
		System.out.println("Count of females - "+count1);
		
		//count of both females and males
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(collect);
		
		//getting count of peoples department wise
		Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(collect2);
		
		
		//get departments without duplicates
		List<String> collect3 = list.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList());
		System.out.println(collect3);
		
		//sorting according to department and getting max salary
		list.stream().filter(e->e.getDepartment().contentEquals("mechanical")).sorted((i,j)->j.getSalary()-i.getSalary()).limit(1).forEach(x->System.out.println(x));
	
		//getting highest Salary according to deparment
		list.stream().filter(e->e.getDepartment().contentEquals("mechanical")).sorted((i,j)->j.getSalary()-i.getSalary()).limit(2).skip(1).forEach(x->System.out.println(x));
		
		List<Employee> collect5 = list.stream().filter(d->d.getDepartment().contentEquals("mechanical")).filter(salary->salary.getSalary()>10000).collect(Collectors.toList());
		
		System.out.println(collect5);
		
		Map<String, Long> collect6 = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println(collect6);
	}
}
