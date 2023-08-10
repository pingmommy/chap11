package com.example;

import java.util.Random;

/*타입만 다르고 모든 게 똑같은 클래스를 타입마다 다르게 선언, 정의해야 한다. 매우 비효율적 -> 제너릭을 쓰면 효율적*/

class BoxInt {    
	private int value;
	int getvalue() {
		return value;
	}
	void setvalue(int v) {
		value = v;
	}
}


class BoxDouble {    
	private double value;
	
	double getvalue() {
		return value;
	}
	
	void setvalue(double v) {
		value = v;
	}
}


class BoxString {    
	private String value;
	
	String getvalue() {
		return value;
	}
	
	void setvalue(String v) {
		value = v;
	}
}


class BoxRandom {    
	private Random value;
	
	Random getvalue() {
		return value;
	}
	
	void setvalue(Random v) {
		value = v;
	}
}




public class BeforeUsingGenericExample {

	
	public static void main(String[] args) {

		BoxInt b1 = new BoxInt();
		BoxDouble b2 = new BoxDouble();
		BoxString b3 = new BoxString();
		BoxRandom b4= new BoxRandom();
	}

}
