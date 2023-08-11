package com.example;


/* 와일드카드타입 파라미터 
사용처 : 제너릭클래스나 제너릭 메소드, 제너릭 인터페이스를 만들 때 사용하는 게 아니다. 제너릭 클래스, 메소드, 인터페이스를 사용 시에 쓴다. 
문법 : <?>                        
변수, 매개변수 등 대입이 일어나는 곳에는 다 사용할 수 있다. */


import java.util.ArrayList;
import java.util.Random;

public class WildeCardGenericExample {

	
	
	public static void main(String[] args) {
		
		int[]a2 =null;
		double[]a3= null;
		
		a2 = new int[] {1,2,3,4,5};
		a3 = new double[] {1.0,2.0,3.0,4.0,5.0};

		ArrayList<Integer> list1 = null;
		
		list1 = new ArrayList<Integer>();
      //list1 = new ArrayList<Double>();  ->  list1의 타입파라미터를 <Integer>라서 Double로 생성할 수 없음. 
		
		
		// ? : 와일드카드 
		ArrayList<?> list2 = null;
		
		list2 = new ArrayList<Integer>();
		list2 = new ArrayList<Double>();
		list2 = new ArrayList<String>();
		list2 = new ArrayList<Random>();
		
		// ->list2의 타입 파라미터가 와일드카드<?>라서 모든 타입으로 Arraylist생성이 가능하다.  
		
		
		
	}

}
