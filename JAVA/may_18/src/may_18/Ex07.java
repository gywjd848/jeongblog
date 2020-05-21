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
//		System.out.println("최종 경계값 >> ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <=n; i++) {
//			sum += i;
//			
//		System.out.printf("전체 합 : %d\n", sum);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		for (;;) {
			System.out.println("구구단");
			int n = sc.nextInt();
			
			if (n < 0) {
				System.out.println("종료");
				break;
			}
			
			for(int i = 1; i <= n; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n*i);
			
			
			}
			
		
				
			}
			
		
	}

}
