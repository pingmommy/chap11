package com.example;

import java.util.ArrayList;

public class Generic_ObjectExample {

	public static void main(String[] args) {
		
		/* 제너릭에 타입을 명시하지 않으면 자동으로 <object>임. 
		 
		 object란?
		 -> 모든 java class의 최고 조상격   
		 -> 모든 타입의 조상이기 때문에 어떤 타입이든 대입할 수 있다. 
		 -> ArrayList의 타입파라미터<타입>를 생략하고 명시하지 않아도 되지만, 타입을 주지 않는 건 올바른 방법이 아니다.
		   (생략할 경우 자동으로 <object>타입)
		*/
		
		
		ArrayList list1 = new ArrayList(); // => <object>이 생략됨. 권장x
		
		list1.add(10); // => (object e)  
		list1.add("hello");
		list1.add(10.5);
		list1.add(true);
		list1.add(System.class);
		
		Object o1 = 10;
		Object o2 = 10.5;
		Object o3 = "Hello";
		Object o4 = true;
		
		
		Object[] a1 = {10, 10.1,"java",false,'A'};
	}

}
