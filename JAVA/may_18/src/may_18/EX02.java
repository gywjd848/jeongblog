package may_18;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		//�ٷ� �ҵ漼�� ����ϴ� ���α׷��� �ۼ�
		//1000���� ���� ���� 8%
		//1000���� �ʰ� 4000���� ���� ���� 17%
		//4000���� �ʰ� 8000���� ���� ���� 26%
		//8000���� �ʰ� ���� 35%
		//����ڰ� �ڽ��� ���� ǥ�� �ݾ��� �Է��ϸ� �ٷ� �ҵ漼�� ����Ͽ� �ִ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ǥ���� �Է��ϼ���.");
		int x = sc.nextInt();
				
		if(x <= 1000) {
			System.out.printf("�ҵ漼�� %0.f\n " + x * 0.08 +  "�Դϴ�.");
		}else if(x < 1000 && 4000 >= x) {
			System.out.printf("�ҵ漼�� %0.f\n " + x * 0.17 +  "�Դϴ�.");			
		}else if(x < 4000 && 8000 >= x) {
			System.out.printf("�ҵ漼�� %0.f\n" + x * 0.26  +  "�Դϴ�.");			
		}else if(x > 8000) {
			System.out.printf("�ҵ漼�� %0.f\n" + x * 0.35 +  "�Դϴ�.");			
		}
			
		
		
	}

}
