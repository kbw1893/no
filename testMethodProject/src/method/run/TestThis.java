package method.run;

import method.sample.Member;

public class TestThis {

	public static void main(String[] args) {
		// this ���۷��� Ȯ��
		Member m1 = new Member();
		System.out.println("m1 �� ���� �ּ� : " + m1.hashCode());
		m1.information();
		
		Member m2 = new Member("user01", "pass01");
		System.out.println("m2 �� ���� �ּ� : " + m2.hashCode());
		m2.information();
		
		Member m3 = new Member("user02", "pass02", "ȫ�浿");
		System.out.println("m3 �� ���� �ּ� : " + m3.hashCode());
		m3.information();
		
		Member m4 = new Member("user03", "pass03", "�̼���", 49, 'M');
		System.out.println("m4 �� ���� �ּ� : " + m4.hashCode());
		m4.information();
	}

}
