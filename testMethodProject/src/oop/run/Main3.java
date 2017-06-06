package oop.run;

import oop.method.NonStaticSample2;

public class Main3 {

	public static void main(String[] args) {
		// NonStaticSample method test
		NonStaticSample2 samp = new NonStaticSample2();

		/*char c = samp.charAt("apple", 3);
		System.out.println("apple 의 3번 인덱스의 글자 : " + c);*/
		
		String result = samp.concat("red", "apple");
		System.out.println("result : " + result);
	}

}
