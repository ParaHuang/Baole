package day6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	Collection									Map
		 		|										|
		 -----------------								HashMap,TreeMap,LinkedHashMap
		 |				|
		 List			Set
		 |				|	
		 ArrayList		HashSet
		 LinkedList		TreeSet
		 Vector			LinkedHashSet
		  
		 */
		
		//1.save unique value   2.no index
//		Set<String> set = new HashSet<>();		//无序
//		Set<String> set = new TreeSet<>();		//自然顺序
		Set<String> set = new LinkedHashSet<>();//添加顺序
		set.add("hello");
		set.add("hey");
		set.add("hi");
		set.add("hey");
		set.add("hello");
		set.add("alex");
		set.add("mike");
		
//		System.out.println(set.size());
//		
//		for(String s:set) {
//			System.out.println(s);
//		}
//		
//		set.remove("hey");
		System.out.println(set);
		
//		System.out.println(set.contains("hey"));
		
	}

}

















