package may_18;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//두 점수의 평균이 90 이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간 고사 점수: ");
		int test1 = sc.nextInt();
		System.out.println("기말 고사 점수: ");
		int test2 = sc.nextInt();
		int x = (test1 + test2) / 2;
				
		if(x >= 90) 
			System.out.printf("당신의 학점은  A학점입니다.\n" );
		else if(x >= 80) 
			System.out.printf("당신의 학점은  B학점입니다.\n" );
		else if(x >= 70) 
			System.out.printf("당신의 학점은  C학점입니다.\n" );
		else if(x >= 60) 
			System.out.printf("당신의 학점은  D학점입니다.\n" );
		else 
			System.out.printf("당신의 학점은  F학점입니다.\n" );
	}
}
