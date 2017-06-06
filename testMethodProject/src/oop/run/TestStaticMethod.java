package oop.run;

import oop.staticmethod.StaticMethod;

public class TestStaticMethod {

	public static void main(String[] args) {
		// StaticMethod test
		/*StaticMethod test = new StaticMethod();
		System.out.println("test : " + test.hashCode());
		test.setValue("apple");
		System.out.println("value : " + test.getValue());*/
		
		StaticMethod.setValue("apple");
		System.out.println("before : " + StaticMethod.getValue());
		//1.
		StaticMethod.toUpper();
		System.out.println("after : " + StaticMethod.getValue());
		//2.
		StaticMethod.setChar(3, 't');
		System.out.println(StaticMethod.getValue());
		//3.
		System.out.println("length : " + StaticMethod.valueLength());
		//4.
		System.out.println("concat : " + StaticMethod.valueConcat(" banana"));
	}

}








