package may_20;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
	
	//임의의 양의 정수를 반복 입력받아 그 중 전체 짝수의 개수를 출력하는 프로그램
	
//	Scanner sc = new Scanner(System.in);
//	
//	int score;
//	int count = 0;
//	
//	while(true) {
//		System.out.println("양수를 입력하세요(나가기->음수 입력) >> ");
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
//	System.out.println("짝수의 개수 : " + count);
		
		
		
		//사용자가 입력한 모든 정수 값들에 대하여 1부터 그 정수까지의 누적 승을 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int s;
		int i;
		char choose;
		
		while(true) {
			s = 1;
			
			System.out.println("임의의 정수를 입력 >> ");
			x = sc.nextInt();
			
			System.out.println("=======================");
			System.out.println("  n      1 부터 n까지의 곱");
			System.out.println("=======================");
			
				for(i = 1; i <= x; i++) 

					System.out.printf("  %d\t\t%d \n", i, s = s * i);
				
			System.out.println("계속 하시겠습니까?(y/n) >> ");
			sc.nextLine();
			choose = sc.nextLine().charAt(0);
			
			if(choose == 'n' ) {
				System.out.println("종료합니다.\n");
				break;
			}
			
		}
		
		
	

	}
}
