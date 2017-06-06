package test.run;

import test.method.NonStaticSample;

public class TestNonStaticMethod {

	public static void main(String[] args) {
		// NonStatic method test
		NonStaticSample test = new NonStaticSample();
		
		//1.
		test.printLottoNumbers();
		//2.
		//test.outputChar();
		//3.
		char returnValue = test.alphabette();
		System.out.println("���ϵ� ���ĺ� : " + returnValue);
		//4.
		String returnStr = test.mySubstring("yellow banana", 7, 10);
		System.out.println("���ϵ� ���ڿ� : " + returnStr);
		
	}

}
