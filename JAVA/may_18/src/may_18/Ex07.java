package may_18;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
//		for(int i = 1; i<=5; i++) {
//			System.out.println("Hello~");
//		}
		
//		for(int i = 1; i<=9; i++) {
//			System.out.printf("%d x %d = %d\n", 9, i, 9*i);
//		}
//		Scanner sc = new Scanner(System.in);
//		
//		int sum = 0;
//		System.out.println("���� ��谪 >> ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <=n; i++) {
//			sum += i;
//			
//		System.out.printf("��ü �� : %d\n", sum);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		for (;;) {
			System.out.println("������");
			int n = sc.nextInt();
			
			if (n < 0) {
				System.out.println("����");
				break;
			}
			
			for(int i = 1; i <= n; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n*i);
			
			
			}
			
		
				
			}
			
		
	}

}
