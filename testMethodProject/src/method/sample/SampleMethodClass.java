package method.sample;

public class SampleMethodClass {
	public SampleMethodClass(){}
	
	//Method
	//반환값 없고 매개변수도 없는 non-static 메소드
	public void hello(){
		System.out.println("안녕하세요...");
		return;
	}
	
	//반환값 없고 매개변수 있는 non-static 메소드
	public void welcome(int no){
		switch(no){
		case 1: 	System.out.println("처음 뵙겠습니다.");	break;
		case 2: 	System.out.println("반갑습니다.");	break;
		}
		
		return;	//생략할 수 있음
	}
	
	//반환값 있고 매개변수 없는 non-static 메소드
	public int lottoNumber(){
		int number = new java.util.Random().nextInt(45) + 1;
		return number;
	}
	
	//반환값 있고 매개변수도 있는 non-static 메소드
	public int value(int bound){
		int number = new java.util.Random().nextInt(bound);
		return number;
	}
}








