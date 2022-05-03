package com.yedam.java.ch13_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		//기본타입으로 쓰고싶은데 map은 클래스만 들어갈수있으면로 기본타입클래스로 넣음
		Map<String,Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장균", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 수 : " + map.size()); //3 -> key는 중복된 값을 가지지 못함. -> 뒤에 오는게 덮어씌운다.
		
		System.out.println("\t홍길동 : " + map.get("홍길동")); // -> 홍길동이라는 key값의 value를 불러온다.
		System.out.println();
		
		Set<String> keySet = map.keySet(); //->map이 가지고있는 key값을 set을 구성 -> 반복자를 사용하기위해서
		Iterator<String> keyInterator = keySet.iterator();
		while(keyInterator.hasNext()) {
			String key = keyInterator.next();
			int value = map.get(key); //->value값을 가지고 와야함
			System.out.println("\t"+key+" : "+value);
		}
		
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //->map을 구성하고있는 entry이용해서 set을 만듬
		
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();
		
		while(entryInterator.hasNext()) {
			Map.Entry<String, Integer> entry =  entryInterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println("\t"+key+":"+value);
		}
		
		

		
		
	}

}
