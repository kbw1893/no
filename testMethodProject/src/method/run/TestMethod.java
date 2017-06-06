package method.run;

import method.sample.SampleMethodClass;

public class TestMethod {

	public static void main(String[] args) {

		// yyyyy 123456 56798

		// 45646546546546545646545

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
