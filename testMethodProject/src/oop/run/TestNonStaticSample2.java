package oop.run;

import java.util.Scanner;

import oop.method.NonStaticSample2;

public class TestNonStaticSample2 {

	public static void main(String[] args) {
		// NonStaticSample test
		NonStaticSample2 samp = new NonStaticSample2();
		
		/*int[] mainAr = samp.intArrayAlloc(5);
		samp.display(mainAr);
		samp.sortDescending(mainAr);
		samp.display(mainAr);
		samp.sortAscending(mainAr);
		samp.display(mainAr);*/
		
		//Ű����� ���ڿ��� ���ڸ� �Է¹޾�, countChar() �޼ҵ�� �Ѱ�
		//ī��Ʈ ����� �޾� ���Ȯ����
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("���ڿ� �Է� : ");
		String s = scan.next();
		System.out.print("���� �ϳ� �Է� : ");
		char c = scan.next().charAt(0);
		
		int count = samp.countChar(s, c);
		
		System.out.println(s + "�� ���Ե� " + c + "������ ���� : " + count);*/
		
		//Ű����� ���� �� ���� �Է¹޾�, totalValue() �޼ҵ�� �ѱ��
		//��� �޾� ��� Ȯ����
		System.out.print("ù��° ���� : ");
		int first = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		int second = scan.nextInt();
		
		int total = samp.totalValue(first, second);
		
		System.out.println("���ϵ� �հ� : " + total);
	}

}








