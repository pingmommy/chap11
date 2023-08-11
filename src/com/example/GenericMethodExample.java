package com.example;

/*일반메소드는 다른 타입을 매개변수로 받으려면 메소드를 오버로딩해서 재정의해야 한다. 
 * 제너릭 메소드를 사용하면 메소드 정의 한 번으로 모든 타입의 대입이 가능하다.  */


public class GenericMethodExample {

	
	
	public static void main(String[] args) {

		xxx(10);	 // -> 메소드 호출 결과  : class java.lang.Integer
		xxx(10.5);   //                 : class java.lang.Double 
  	 
		GenericMethodExample.<Integer>xxx(10); //-> 타입파라미터를<> 이 경우처럼 명시하는 경우는 많지 않음. 값으로 유추가능하기 때문에
		
	
	}
	
	//제너릭 메소드
	static <T> void xxx(T x) {
		System.out.println(x.getClass());
	}
	
	

	//일반 정적메소드
	static void yyy(int x) {
		
	}
	
	static void yyy(double x) {
		
	}
}


 