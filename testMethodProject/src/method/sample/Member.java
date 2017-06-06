package method.sample;

public class Member {
	//Field
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender; 	//����: 'M', ����: 'F'
	
	//Constructor
	public Member(){
		//System.out.println("this �� ���� �ּ� : " + this.hashCode());
	}
	
	public Member(String userId, String userPwd){
		//System.out.println("this �� ���� �ּ� : " + this.hashCode());
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	public Member(String userId, String userPwd, String userName){
		//System.out.println("this �� ���� �ּ� : " + this.hashCode());
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public Member(String userId, String userPwd, String userName,
			int age, char gender){
		//System.out.println("this �� ���� �ּ� : " + this.hashCode());
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	//Method
	public void information(){
		//System.out.println("this �� ���� �ּ� : " + this.hashCode());
		System.out.println(this.userId + ", " + this.userPwd + ", " 
				+ this.userName + ", " + this.age + ", " + 
				this.gender);
		return;
	}
}







