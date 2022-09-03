package com.flatmap.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = Stream.of(new Employee(101, "pankaj gote", 21, "male", "mechanical", 1000,Arrays.asList(12345,23456)),
				new Employee(102, "abhijeet", 26, "male", "computer", 2600,Arrays.asList(34567,45678)),
				new Employee(103, "sahil", 25, "male", "mechanical", 15000,Arrays.asList(56789,67890)),
				new Employee(105, "jaggu", 27, "male", "computer", 2600,Arrays.asList(9876,98765)),
				new Employee(106, "aniket", 22, "male", "entc", 14000,Arrays.asList(87654,76543)),
				new Employee(107, "shamali", 21, "female", "computer", 26000,Arrays.asList(65432,54321))).collect(Collectors.toList());
	
			List<Integer> collect = list.stream().filter(d->d.getDepartment().contentEquals("computer")).flatMap(cont->cont.getContacts().stream()).collect(Collectors.toList());
			
			System.out.println(collect);
	
			String string = list.stream().filter(d->d.getDepartment().contentEquals("computer")).map(Employee::getName).max(Comparator.comparing(String::length)).get();
			
			System.out.println(string);
			
			Integer integer = list.stream().filter(d->d.getDepartment().contentEquals("computer")).map(Employee::getName).map(String::length).max(Integer::compareTo).get();
			
			System.out.println(integer);
			
			List<List<Integer>> collect2 = list.stream().filter(d->d.getDepartment().contentEquals("computer")).flatMap(cont->Stream.of(cont.getContacts())).collect(Collectors.toList());
			
			System.out.println(collect2);
			
//			list.stream().filter(d->d.getDepartment().contentEquals("computer")).flatMap(contacts->contacts.getContacts().stream()).forEach(t->System.out.println(t));
	
			//sum of all int id's from employee class
			Integer reduce = list.stream().map(Employee::getId).reduce(0,(t,k)->t+k);
			
			System.out.println(reduce);
			
			//sum of int id's from mechanical department
			Integer reduce2 = list.stream().filter(d->d.getDepartment().contentEquals("mechanical")).map(Employee::getId).reduce(0,(t,k)->t+k);
			
			System.out.println(reduce2);
			//sorting according to salary in desc order
			 List<Employee> collect3 = list.stream().filter(d->d.getDepartment().contentEquals("mechanical")).sorted((i,j)->j.getSalary()-i.getSalary()).collect(Collectors.toList());
			 
			
			System.out.println(collect3);
			
			//highest salary
			list.stream().filter(d->d.getDepartment().contentEquals("mechanical")).sorted((i,j)->j.getSalary()-i.getSalary()).limit(1).forEach(x->System.out.println(x));
			
			//2nd highest salary
			list.stream().filter(d->d.getDepartment().contentEquals("mechanical")).sorted((i,j)->j.getSalary()-i.getSalary()).limit(2).skip(1).forEach(x->System.out.println(x));
	
			list.stream().filter(d->d.getDepartment().contentEquals("computer")).map(Employee::getSalary).sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(x->System.out.println(x));
	}
}
