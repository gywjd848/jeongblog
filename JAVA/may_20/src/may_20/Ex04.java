package may_20;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
	
	//������ ���� ������ �ݺ� �Է¹޾� �� �� ��ü ¦���� ������ ����ϴ� ���α׷�
	
//	Scanner sc = new Scanner(System.in);
//	
//	int score;
//	int count = 0;
//	
//	while(true) {
//		System.out.println("����� �Է��ϼ���(������->���� �Է�) >> ");
//		score = sc.nextInt();
//
//		if(score < 0) {
//			break;
//		}
//
//		if(score%2 == 0) {
//			count++;		
//		}
//	}
//	
//	System.out.println("¦���� ���� : " + count);
		
		
		
		//����ڰ� �Է��� ��� ���� ���鿡 ���Ͽ� 1���� �� ���������� ���� ���� ����ϴ� ���α׷� �ۼ�
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int s;
		int i;
		char choose;
		
		while(true) {
			s = 1;
			
			System.out.println("������ ������ �Է� >> ");
			x = sc.nextInt();
			
			System.out.println("=======================");
			System.out.println("  n      1 ���� n������ ��");
			System.out.println("=======================");
			
				for(i = 1; i <= x; i++) 

					System.out.printf("  %d\t\t%d \n", i, s = s * i);
				
			System.out.println("��� �Ͻðڽ��ϱ�?(y/n) >> ");
			sc.nextLine();
			choose = sc.nextLine().charAt(0);
			
			if(choose == 'n' ) {
				System.out.println("�����մϴ�.\n");
				break;
			}
			
		}
		
		
	

	}
}
