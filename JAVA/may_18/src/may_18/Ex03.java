package may_18;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//�� ������ ����� 90 �̻� A, 80�̻� B, 70�̻� C, 60�̻� D, ������ F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�߰� ��� ����: ");
		int test1 = sc.nextInt();
		System.out.println("�⸻ ��� ����: ");
		int test2 = sc.nextInt();
		int x = (test1 + test2) / 2;
				
		if(x >= 90) 
			System.out.printf("����� ������  A�����Դϴ�.\n" );
		else if(x >= 80) 
			System.out.printf("����� ������  B�����Դϴ�.\n" );
		else if(x >= 70) 
			System.out.printf("����� ������  C�����Դϴ�.\n" );
		else if(x >= 60) 
			System.out.printf("����� ������  D�����Դϴ�.\n" );
		else 
			System.out.printf("����� ������  F�����Դϴ�.\n" );
	}
}
