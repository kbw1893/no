package test.method;

public class NonStaticSample {
	//default Constructor
	public NonStaticSample(){}
	
	//1. ��ȯ�� ���� �Ű����� ���� �޼ҵ�
	//���� ��û�� 1~45������ ������ ���� 6�� �ߺ����� �ʰ� �߻����� ����ϴ� �޼ҵ�
	//�޼ҵ�� : printLottoNumbers
	public void printLottoNumbers(){
		int[] lottos = new int[6];
		
		//�� �߻�
		for(int i = 0; i < lottos.length; i++){
			lottos[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++){ //�ߺ� üũ
				if(lottos[i] == lottos[j]){
					i--;
					break;
				}
			}
		}
		
		//���
		for(int i = 0; i < lottos.length; i++)
			System.out.print(lottos[i] + "   ");
		System.out.println();

		return;
	}
	
	//2. ��ȯ�� ���� �Ű����� �ִ� �޼ҵ�
	//���� ��û�� ���� �ϳ�, ���� �ϳ��� ���޹޾� ���ڸ� ���� ������ŭ ����ϴ� �޼ҵ�
	//�޼ҵ�� : outputChar
	public void outputChar(int count, char c){
		for(int k = 1; k <= count; k++)
			System.out.print(c + "   ");
		System.out.println();
		
		return;
	}
	
	//3. ��ȯ�� �ְ� �Ű����� ���� �޼ҵ�
	//���� ��û�� ���ĺ� ������ ������ �����ڸ� �ϳ� �߻����� �����ϴ� �޼ҵ�
	//�޼ҵ�� : alphabette
	public char alphabette(){
		int code = 0;
		do{		//65 ~ 122 ������ ������ ������ ���� �߻���Ŵ
			//(int)(Math.random() * �����ǳ���) + ���۰�
			// ������ ���� : �ִ밪 - �ּҰ� + 1
			code = (int)(Math.random() * ('z' - 'A' + 1)) + 65;
			
			//if(Character.isAlphabetic(code)){
			if((code >= 'A' && code <= 'Z') || 
					(code >= 'a' && code <= 'z'))
				break;
		}while(true);
		
		return (char)code;
	}
	
	//4. ��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�
	//���� ��û�� ���ڿ��� �����ε���, ���ε����� ���޹޾� �ش� �ε��� ������ ���ڿ���
	//�����Ͽ� �����ϴ� �޼ҵ�. �� ���ڿ��� �ݵ�� ���� �־����. ������ null ����ó��
	//�޼ҵ�� : mySubstring
	public String mySubstring(String s, int beginIndex, int endIndex){
		String returnValue = null;
		
		if(s != null && s.length() > 0){  //���޵� ���ڿ����� �ִ��� Ȯ��
			if(beginIndex < s.length() && endIndex < s.length()){
				//�ε����� ���� �������� ������ Ȯ��
				if(beginIndex < endIndex){
					//���� �ε����� �� �ε������� ���� ������ Ȯ��
					returnValue = String.valueOf(s.charAt(beginIndex));
					for(int i = beginIndex + 1; i <= endIndex; i++){
						returnValue += s.charAt(i);
					}
				}
			}
		}
		
		return returnValue;
	}
}



