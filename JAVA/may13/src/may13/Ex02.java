package may13;

import java.util.Scanner;

public class Ex02 {
	//4�� ������ �������� 100���� ������ ������������
	//Ȥ�� 400���� ������ �������� ������ �����̴�.
	//�Է¹��� ������ �����̸� true �ƴϸ� false
	
	public static void main(String[] args) {
	//	int x,y,z;
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("������ �Է��ϼ���.");
	//	int year = sc.nextInt();
		
	//	x = year/4;
	//	y = year/100;
	//	z = year/400;
		
	//  boolean bool;
	//	bool = year%x == 0 && year%y != 0 || year%z == 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int year = sc.nextInt();
		
		boolean bool = (year% 4 == 0) && (year% 100 != 0) || (year% 400 == 0);

		System.out.println("���� "+ bool);
		
	}
}
