package may13;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//1���� 5������ ������ ���Ͽ� ���� ���� ������ ���� ����ϴ� ���α׷��� �ۼ�
		//���� ���� ������ ���������ڸ� Ȱ��
		
		/*
		int x = 1;
		
		System.out.printf("%10s%10s%10s\n", "int", "Square", "Cube");
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		*/
		
		//����ڷκ��� ����, ����, ö�� ������ �Է� �޾� �� ������ 70�� �̻��̸� ���, 
		//�׷��� ������ ������ȸ�� ��� ���ڿ��� ��µǴ� ���α׷��� �ۼ�(���ǿ����ڸ� �̿�)
		
		/*
		int a, b, c;
	
		Scanner s = new Scanner(System.in);
			
		System.out.println("���� ������ �Է��ϼ���.");
		a = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		b = s.nextInt();
		System.out.println("ö�� ������ �Է��ϼ���.");
		c = s.nextInt();
		
		//boolean bool = (a>=70 && b>=70 && c>=70);
		//System.out.println(bool? "���":"������ȸ��");
		
		System.out.println((a>=70 && b>=70 && c>=70) ? "���":"������ȸ��");
		*/
		
		
		//�� �ڸ��� �̷���� ������ ���� ���� ���� �Է� ���� �Ŀ� ������ �ڸ����� �и��ϰ� �� �ڸ����� ����ϴ� ���α׷� �ۼ�
		//������ �Է� : 378
		//���� �ڸ��� : 3
		//���� �ڸ��� : 7
		//���� �ڸ��� : 8
		
		int num;
		System.out.println("������ �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//System.out.println("���� �ڸ��� : " + num / 100);
		//System.out.println("���� �ڸ��� : " + num %100/10);
		//System.out.println("���� �ڸ��� : " + num %10);
		
		System.out.println("���� �ڸ��� : " + num / 100);
		System.out.println("���� �ڸ��� : " + num / 10%10);
		System.out.println("���� �ڸ��� : " + num / 1%10);
		
		
	
		
	
	
		
		
	}

}
