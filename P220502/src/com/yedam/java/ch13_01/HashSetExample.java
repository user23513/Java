package com.yedam.java.ch13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //-> 값이 들어가지 못함. 중복된 개체라서.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		//Set 타입 스트링이면 반복자도 스트링
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element); // \t는 tab만큼 띄우는
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수 : " + set.size());
		
		for(String str : set) {
			System.out.println("\t" + str);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음.");
		}
		
		
		
	}

}
