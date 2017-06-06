package oop.method;

public class NonStaticSample2 {
	public NonStaticSample2(){}
	
	//int �Ѱ��� ���ް��� �޾Ƽ�, �迭�� �ּҸ� �����ϴ� �޼ҵ�
	//ó���� ���� : ���޹��� ���� ������ŭ�� �迭������ �Ҵ��Ͽ�, 
	//         ������ 1���� 100������ ������ �� ����ϰ� �ּ� ������
	//�޼ҵ� �� : intArrayAllocation
	public int[] intArrayAlloc(int su){	//�Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
		int[] ar = new int[su];
		
		for(int i = 0; i < ar.length; i++)
			ar[i] = (int)(Math.random() * 100) + 1;
		
		return ar;
	}

	public void display(int[] ar){  //�Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
		for(int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + "   ");
		System.out.println();
		return;
	}
	
	public void swap(int[] ar, int i, int j){
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	
	public void sortDescending(int[] ar){
		//select sort ���
		for(int i = 0; i < ar.length - 1; i++){
			for(int j = i + 1; j < ar.length; j++){
				if(ar[i] < ar[j])
					swap(ar, i, j);
			}
		}
	}
	
	public void sortAscending(int[] ar){
		//select sort ���
		for(int i = 0; i < ar.length - 1; i++){
			for(int j = i + 1; j < ar.length; j++){
				if(ar[i] > ar[j])
					swap(ar, i, j);
			}
		}
	}
	
	//1. ���ڿ��� ���� �ϳ��� ���޹޾�, ���ڿ��� ���Ե� ������ ������ �����ϴ� �޼ҵ�
	//���Ե� ���ڰ� ������ 0 ������
	//�޼ҵ�� : countChar
	public int countChar(String str, char ch){
		int count = 0;
		
		if(str != null && str.length() > 0){  //���޵� ���ڿ� ���� �������� ó��
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == ch)
					count++;
			}
		}
		
		return count;
	}
	
	//2. ���� �� ���� ���޹޾�, �� ���� ���� ������ ū �������� �������� �հ踦 ���ؼ�
	//�����ϴ� �޼ҵ�
	//�޼ҵ�� : totalValue
	public int totalValue(int first, int second){
		int sum = 0, min, max;
		
		if(first > second){
			max = first;
			min = second;
		}else{
			min = first;
			max = second;
		}
		
		System.out.println(min + "���� " + max + "������ �հ�");
		
		for(int k = min; k <= max; k++)
			sum += k;		
		
		return sum;
	}
	
	//���ڿ��� �ε����� ���޹޾�, �� ��ġ�� ���ڸ� �����ϴ� �޼ҵ�
	public char charAt(String s, int index){
		char[] charArr = s.toCharArray();
		return charArr[index];
	}
	
	//�� ���� ���ڿ��� ���޹޾�, �ϳ��� ���ڿ��� ���ļ� �����ϴ� �޼ҵ�
	public String concat(String s1, String s2){
		return s1 + s2;
	}
}







