package com.example;

/*와일드 카드의 제한 
 
 class A를 기준으로 1. 자식만 가능 (upperBound) <?  extends A>
                 2. 부모만 가능 (lower Bound)  <?  super A>

 */


import java.util.ArrayList;
import java.util.Random;

import com.example.LimitedGenericMethodExample.A;
import com.example.LimitedGenericMethodExample.B;

public class WildeCardGenericExample2 {
  
	static class A{}
	static class B extends A{}
	static class C extends A{}
	static class D extends B{}
	static class E extends D{}
	
	
	public static void main(String[] args) {
		
	
		// ? : 와일드카드 
		ArrayList<?> list1 =  null;
		
		list1 =  new ArrayList<A>();
		list1 =  new ArrayList<Integer>();
		list1 = new ArrayList<Double>();
		list1 = new ArrayList<String>();
		list1 = new ArrayList<Random>();
		
		//(upperBound) <?  extends A>
		
		
		
		
		//(lower Bound) <?  super E>
		
		
		
	}

}
