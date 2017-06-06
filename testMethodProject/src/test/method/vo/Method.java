package test.method.vo;

public class Method {
	private String a;
	private String b;
	
	
	public void Method(){
		
	}


	public Method(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}


	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Method [a=" + a + ", b=" + b + ", getA()=" + getA() + ", getB()=" + getB() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
	
	
}
