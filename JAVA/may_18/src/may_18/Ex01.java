package may_18;

import java.util.Scanner;
//�Է¹��� �� ���� �հ� ���� ���Ͽ� ���
//�μ��� ���� ū ������ �������� �������� �Ѵ�
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է��ϼ���.");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		System.out.printf("�� ���� �� :%d\n" + (num1 + num2));
		
		if(num1 > num2)
			System.out.printf("�� ���� �� :%d\n" + (num1 - num2));				
		else
			System.out.printf("�� ���� �� :%d\n" + (num2 - num1));				
		
		
		
		
		
	}
	
}
