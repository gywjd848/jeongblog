package may_20;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
//		int i = 1;
		
//		do {
//			System.out.println("Hello~");
//			i++;
//		}while(i <= 10);
		
		
		
		//1���� 10������ �� ���ϱ�
		
//		int i = 1;
//		int s = 0;
//		
//		do {
//			s+=i;
//			i++;
//		}while(i<=10);
//		System.out.printf("��ü �� : %d\n", s);
		
		
		
		//������ �Է¹ް� ��������� ���Ѵ�. ���̻� �Է��� �л��� ������ ������ �Է��� ���ѷ��� ����������
		
//		Scanner sc = new Scanner(System.in);
//		
//		int score;
//		int stu = 0;
//		int sum = 0;
//		
//		do {
//			System.out.printf("%d�� �л� ���� ������ �Է� >> \n", stu);
//			score = sc.nextInt();
//			
//			if(score < 0)
//				break;
//			
//			sum += score;
//			stu++;
//			
//		}while(true);
//		
//			double total = (double)sum/stu;
//			
//			System.out.printf("���� ���� ��� ���� >> %.1f\n", total);
//		
		
		
		//�޴����� ������ �޴� ���� ��� �ݺ�
		
//			int i = 0;
//			int sum = 0;
//			int menu;
//			
//			Scanner sc = new Scanner(System.in);
//			
//			do {
//				System.out.println("1. ���Ͽ���");
//				System.out.println("2. ��������");
//				System.out.println("�޴� ���� >> ");
//				menu = sc.nextInt();
//								
//			}while(menu > 1 || menu > 2);
		
		
		
			//Ư�� ���� �Է¹޾����� 1~12���� �ƴ� �ٸ� ���� �Է½� �ٽ� �Է¹ޱ�
			//��Ȯ�� �Է½� ���ϱ��� �ִ��� ���
		
			Scanner sc = new Scanner(System.in);
			
			int month;
			int days;
			
			do {
				System.out.println("���� �Է��ϼ���>> ");
				month = sc.nextInt();
				
				if(month < 1 || month > 12)
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���(1��~12��) >> ");
				else break;
				
			}while(true);
				
				switch (month) {
				case 2: days = 28;
					break;
					
				case 4: case 6: case 9: case 11: days = 30;					
					break;

				default: days = 31;
				}
				
			
			System.out.printf("%d���� %d�� ���� �ֽ��ϴ�.\n", month, days);
			
	
	}
}


