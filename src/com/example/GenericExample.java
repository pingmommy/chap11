package com.example;

import java.util.Random;



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


public class GenericExample {

	
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
