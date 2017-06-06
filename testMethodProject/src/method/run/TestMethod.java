package method.run;

import method.sample.SampleMethodClass;

public class TestMethod {

	public static void main(String[] args) {
		// 클래스가 제공하는 non-static 메소드를 사용하려면
		SampleMethodClass samp = new SampleMethodClass();
		
		//반환값 없고 매개변수 없는 메소드 실행
		samp.hello();
		//반환값 없고 매개변수 있는 메소드 실행
		samp.welcome(1);
		samp.welcome(2);

		//반환값 있고 매개변수 없는 메소드 실행
		int num = samp.lottoNumber();
		System.out.println("num : " + num);
		//반환값 있고 매개변수 있는 메소드 실행
		int num2 = samp.value(100);
		System.out.println("num2 : " + num2);
	}

}
