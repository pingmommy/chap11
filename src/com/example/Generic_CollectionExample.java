package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Generic_CollectionExample {

	public static void main(String[] args) {
		
		// 배열은 데이터처리에 제한적이다. 
		int[] a = {1,2,3,4,5};
		String[] b = {"hello","java","sql"};
		
		
		// 컬렉션은 데이터처리에 용이하다. 
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hi");
		
		
		//HashMap<K, V> => 타입이 2개 주어져야 한다. 
		HashMap<Integer,Character> map1 = new HashMap<Integer, Character>();
		map1.put(67, 'C');

		
		HashMap<String, Integer> map2 = new HashMap<>(); // => new 연산자 뒷 부분 <> 안의 타입은 생략가능. 
		map2.put("java", 10000);
		
		
		// 제너릭 인터페이스 
		Comparator<Integer> c1 = new Comparator<Integer>() { // => Integer 타입으로 선언
			
			@Override
			public int compare(Integer o1, Integer o2) {

				return 0;
			}
		};
		
		Comparator<String> c2 = new Comparator<String>() { // => String 타입으로 선언 
			
			@Override
			public int compare(String o1, String o2) {
				return 0;
			}
		};
		
		
	}

}
