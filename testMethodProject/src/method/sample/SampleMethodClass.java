package method.sample;

public class SampleMethodClass {
	public SampleMethodClass(){}
	
	//Method
	//��ȯ�� ���� �Ű������� ���� non-static �޼ҵ�
	public void hello(){
		System.out.println("�ȳ��ϼ���...");
		return;
	}
	
	//��ȯ�� ���� �Ű����� �ִ� non-static �޼ҵ�
	public void welcome(int no){
		switch(no){
		case 1: 	System.out.println("ó�� �˰ڽ��ϴ�.");	break;
		case 2: 	System.out.println("�ݰ����ϴ�.");	break;
		}
		
		return;	//������ �� ����
	}
	
	//��ȯ�� �ְ� �Ű����� ���� non-static �޼ҵ�
	public int lottoNumber(){
		int number = new java.util.Random().nextInt(45) + 1;
		return number;
	}
	
	//��ȯ�� �ְ� �Ű������� �ִ� non-static �޼ҵ�
	public int value(int bound){
		int number = new java.util.Random().nextInt(bound);
		return number;
	}
}








