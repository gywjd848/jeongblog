package may_20;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//10���� ������ �Է¹޾� �ִ񰪰� �ּڰ� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int min = 0;
		int max = 0;
		
		System.out.printf("%d��° ���� �Է� : ", 1);
		max = min = num = sc.nextInt();
		
		for(int i = 2; i <=10; i++) {
			System.out.printf("%d��° ���� �Է� : ", i);
			num = sc.nextInt();
			
			if (max < num)
				max = num;
			
			if (min > num)
				min = num;

//			min = num<min? num:min;
//			max = num>max? num:max;
		
		}
		
		System.out.printf("�ּڰ� : %d\n", min);
		System.out.printf("�ִ� : %d\n", max);
		
			
	}

}
