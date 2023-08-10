package com.example;

import java.util.Random;

/*
 ******* 제너릭클래스 *******
 
 *<T> -> 타입파라미터 
 * 
 *제너릭은 oop에 포함되진 않는다. 

 * 많은 라이브러리들이 제너릭으로 되어 있다. 

 *제너릭으로 이루어진 라이브러리 중 대표적인 것은 컬렉션라이브러리다. 
 
 *제너릭은 값을 넘겨주는 게 아니라 타입을 넘겨준다. 그러면 안의 모든 타입이 넘겨준 타입으로 바뀐다. 
 */

// BeforeUsingGenericExample 코드와 비교
class Box<T>{
	T value;
	
	T getvalue() {
		return value;
	}
	
	void setValue(T value) {
		this.value = value;
	}
}


public class GenericExample2 {

	
	public static void main(String[] args) {
		
		// primitive타입에 대응되는 참조타입 8개. 참조타입이라서 null이 저장됨. 
		Box<Byte> b1 = new Box<>();
		Box<Short> b2 = new Box<>();
		Box<Character> b3 = new Box<>();
		Box<Integer> b4 = new Box<>();
		Box<Long> b5 = new Box<>();
		Box<Float> b6 = new Box<>();
		Box<Double> b7 = new Box<>();
		Box<Boolean> b8 = new Box<>();
		Box<String> b9 = new Box<>();
		Box<Random> b10 = new Box<>();
		
	}

}
