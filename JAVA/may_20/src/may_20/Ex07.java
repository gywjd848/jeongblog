package may_20;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int sum = 0;
//		
//		System.out.println("��� �Է� : ");
//		int num = sc.nextInt();		
//		
//		for(int i = 1; i <= num; i++) {
//			if(i%2 == 1)
//				continue;
//			
//			sum += i;
//		}
//		
//		System.out.println("��ü �� : " + sum);
		
		
		int cnt = 0;
		
		go:
		
		for(int i=1; i<=3; i++) {
			cnt++;
			System.out.printf("\n[%d��]\n", i);
			
			for(int j=1; j<=3; j++) {
				System.out.println("Inner for loop~~");
				
				if(cnt == 2)
					break go;
			}
			
			System.out.println("\nOuter for loop");
		}
		
		System.out.println("��Ҵ�~~");
	}

}
