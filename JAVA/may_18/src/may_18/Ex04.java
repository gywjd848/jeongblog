package may_18;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�⵵�� �Է��ϼ��� >> ");
		int year = sc.nextInt();
		System.out.println("���� �Է��ϼ��� >> ");
		int month = sc.nextInt();
		int days;
		
		switch (month) {
		case 2: 
			if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
				days = 29; 
			else
				days = 28; break;
		case 4: case 6: case 9: case 11: days = 30; break;
		default: days = 31;
		}
		
		System.out.printf("�Է��� %d�� %d���� %d�ϱ��� �ֽ��ϴ�.\n", year, month, days);
//		
//		System.out.println("  [[menu]]  ");
//		System.out.println("1. «�� ");
//		System.out.println("2. ����");
//		System.out.println("3. ��ȸ�����");
//		System.out.println("4. Į����");
//		System.out.println("�޴� ���� >> ");
//		
//		int menu = sc.nextInt();
//		
//		switch (menu) {
//		case 1: System.out.println("«�� ����~~!"); break;
//		case 2: System.out.println("���� ����~~!"); break;
//		case 3: System.out.println("��ȸ����� ����~~!"); break;
//		case 4: System.out.println("Į���� ����~~!"); break;
//		default: System.out.println("�������� �ʴ� �׸��Դϴ�.");
		
		
//		}
	}
}
