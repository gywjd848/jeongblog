package may_18;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
//		int cnt = 1;
//		while (cnt <= 5) {
//			System.out.println("Hello~~");
//			cnt++;		
//		}

//		int i = 1;
//		
//		while (i <= 9) {
//			System.out.printf("%d x %d = %d\n", 7, i, 7*i);
//			i++;
//		}
		
//		int i = 1;
//		int s = 0;
//					
//		while (i <= 10) {
//			s += i; //s = s + i;
//			i++;
//		}
//		System.out.printf("��ü �� : %d\n", s);
		
		//ö�� ������ �߰���� ������ ��ü ������� ���ϱ�
		//���� �Է� ���� �л� �� �ο����� �˼� ����
		//��ü ���� ���ѷ��� �ȿ��� ���ϰ� ������ �̿��� �ݺ��� ���� ������
		Scanner sc = new Scanner(System.in);
		
		int score;
		int stu = 0;
		int sum = 0;		
		
		while(true) {
			System.out.printf("%d�� �л� ö�� �߰���� ���� �Է�(������(�����Է�)) >> ", stu);		
			score = sc.nextInt();
						
			if (score < 0)
				break;
			
			sum += score;
			stu++;
		}
		
		double total = (double)sum/stu;
		System.out.printf("ö�а��� ��ü ������� : %.2f\n", total);
		
		
	}

}
