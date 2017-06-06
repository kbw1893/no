package method.run;

import method.sample.SampleMethodClass;

public class TestMethod {

	public static void main(String[] args) {
		// yyyyy
		SampleMethodClass samp = new SampleMethodClass();
		
		//��ȯ�� ���� �Ű����� ���� �޼ҵ� ����
		samp.hello();
		//��ȯ�� ���� �Ű����� �ִ� �޼ҵ� ����
		samp.welcome(1);
		samp.welcome(2);

		//��ȯ�� �ְ� �Ű����� ���� �޼ҵ� ����
		int num = samp.lottoNumber();
		System.out.println("num : " + num);
		//��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ� ����
		int num2 = samp.value(100);
		System.out.println("num2 : " + num2);
	}

}
