package oop.staticmethod;

public class StaticMethod {
	//Field
	private static String value;
	
	//Constructor  : 필드가 모두 static 일 때는 생성자 필요없음
	/*public StaticMethod(){}
	
	public StaticMethod(String value){
		this.value = value;
	}*/
	
	//value 필드 값 변경용 : 필드가 static이면 setter 도 static 이어야 함
	public static void setValue(String v){
		//System.out.println("this : " + this.hashCode());
		value = v;
	}
	
	//value 필드 값 조회용 : 필드가 static 이면 getter 도 static 이어야 함
	public static String getValue(){
		return value;
	}
	
	//필드가 모두 static 일 때는 메소드도 전부 static 이어야 함
	//static method
	//1. 반환값 없고 매개변수 없는 메소드
	//value 필드 값을 모두 대문자로 바꾸는 static 메소드
	//메소드명 : toUpper
	public static void toUpper(){
		if(value != null && value.length() > 0){
			//String -> char[]
			char[] values = value.toCharArray(); // String char배열로 바꿈
			for(int i = 0; i < values.length; i++){ // 
				
					if(values[i] >= 'a' && values[i] <= 'z')//영문자인데 소문자냐? 
						values[i] -= 32;
								
			}  //for closed
			value = String.valueOf(values); // char[] 배열을 다시 String 으로 바꿈
		}
	}
	
	//2. 반환값 없고 매개변수 있는 메소드
	//인덱스와 문자를 전달받아
	//value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
	//메소드명 : setChar
	public static void setChar(int index, char ch){
		if(value != null && value.length() > 0){	//value 가 반드시 값을 가지고 있다면...
			if(index >= 0 && index < value.length()){
				//String 타입의 문자열 값에서 문자하나의 값을 변경하는 방법
				//java.lang.String 클래스에는 문자하나의 값을 변경하는 메소드가 제공 안 됨
				//String -> char[] 로 바꾼 다음, 문자 하나의 값을 변경하고,
				//char[] -> String 으로 바꾸는 방법
				char[] values = value.toCharArray();
				values[index] = ch;
				value = String.valueOf(values);
			}
		}
	}
	//3. 반환값 있고 매개변수 없는 static 메소드
	//value 필드에 기록된 글자갯수 리턴 처리
	//메소드명 : valueLength
	public static int valueLength(){
		return value.length();		
	}
	
	//4. 반환값 있고 매개변수 있는 static 메소드
	//문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
	//메소드명 : valueConcat
	public static String valueConcat(String other){
		if(value != null && value.length() > 0){
			return value + other;
		}else
			return null;
	}

}






