package method.run;

import method.sample.Member;

public class TestThis {

	public static void main(String[] args) {
		// this 레퍼런스 확인
		Member m1 = new Member();
		System.out.println("m1 이 가진 주소 : " + m1.hashCode());
		m1.information();
		
		Member m2 = new Member("user01", "pass01");
		System.out.println("m2 가 가진 주소 : " + m2.hashCode());
		m2.information();
		
		Member m3 = new Member("user02", "pass02", "홍길동");
		System.out.println("m3 가 가진 주소 : " + m3.hashCode());
		m3.information();
		
		Member m4 = new Member("user03", "pass03", "이순신", 49, 'M');
		System.out.println("m4 가 가진 주소 : " + m4.hashCode());
		m4.information();
	}

}
