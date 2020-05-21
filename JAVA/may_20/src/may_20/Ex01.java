package may_20;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
//		int i = 1;
		
//		do {
//			System.out.println("Hello~");
//			i++;
//		}while(i <= 10);
		
		
		
		//1부터 10까지의 합 구하기
		
//		int i = 1;
//		int s = 0;
//		
//		do {
//			s+=i;
//			i++;
//		}while(i<=10);
//		System.out.printf("전체 합 : %d\n", s);
		
		
		
		//점수를 입력받고 평균점수를 구한다. 더이상 입력할 학생이 없으면 음수를 입력해 무한루프 빠져나오기
		
//		Scanner sc = new Scanner(System.in);
//		
//		int score;
//		int stu = 0;
//		int sum = 0;
//		
//		do {
//			System.out.printf("%d번 학생 국어 점수를 입력 >> \n", stu);
//			score = sc.nextInt();
//			
//			if(score < 0)
//				break;
//			
//			sum += score;
//			stu++;
//			
//		}while(true);
//		
//			double total = (double)sum/stu;
//			
//			System.out.printf("국어 과목 평균 점수 >> %.1f\n", total);
//		
		
		
		//메뉴선택 엉뚱한 메뉴 고르면 계속 반복
		
//			int i = 0;
//			int sum = 0;
//			int menu;
//			
//			Scanner sc = new Scanner(System.in);
//			
//			do {
//				System.out.println("1. 파일열기");
//				System.out.println("2. 파일저장");
//				System.out.println("메뉴 선택 >> ");
//				menu = sc.nextInt();
//								
//			}while(menu > 1 || menu > 2);
		
		
		
			//특정 달을 입력받았을때 1~12월이 아닌 다른 수를 입력시 다시 입력받기
			//정확히 입력시 몇일까지 있는지 출력
		
			Scanner sc = new Scanner(System.in);
			
			int month;
			int days;
			
			do {
				System.out.println("달을 입력하세요>> ");
				month = sc.nextInt();
				
				if(month < 1 || month > 12)
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요(1월~12월) >> ");
				else break;
				
			}while(true);
				
				switch (month) {
				case 2: days = 28;
					break;
					
				case 4: case 6: case 9: case 11: days = 30;					
					break;

				default: days = 31;
				}
				
			
			System.out.printf("%d월은 %d일 까지 있습니다.\n", month, days);
			
	
	}
}


