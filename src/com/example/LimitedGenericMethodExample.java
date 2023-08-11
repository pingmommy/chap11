package com.example;

/* ******* 제한된 타입파라미터 ******* 
  
 제너릭클래스, 제너릭인터페이스, 제너릭 메소드를 만들 때  
제너릭이 성립하는 조건은 타입파라미터<T>이다.
타입 파라미터에 제한이 없다면 모든 타입이 올 수 있다. 
때에 따라서 타입의 제한이 필요할 때가 있다. 
이 때 extends 키워드를 사용해서 타입 파라미터를 제한할 수 있다. 

문법 : <T extends B>
 
 */


public class LimitedGenericMethodExample {

	
	static class A{}
	static class B extends A{}
	static class C extends A{}
	static class D extends B{}
	
	public static void main(String[] args) {
		
		yyy(new B());
		yyy(new D());
	//	yyy(new A());  =>제한된 파라미터의 조건에 맞지 않기 때문에 오류. 
	//	yyy(new C());  =>제한된 파라미터의 조건에 맞지 않기 때문에 오류. 

	}

	static <T extends B> void yyy(T x) {} // class B나 class B를 상속한 자식클래스의 타입만 매개변수로 올 수 있다. 
}                                          





 