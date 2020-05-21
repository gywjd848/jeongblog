package may_18;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
//		int cnt = 1;
//		while (cnt <= 5) {
//			System.out.println("Hello~~");
//			cnt++;		
//		}

//		int i = 1;
//		
//		while (i <= 9) {
//			System.out.printf("%d x %d = %d\n", 7, i, 7*i);
//			i++;
//		}
		
//		int i = 1;
//		int s = 0;
//					
//		while (i <= 10) {
//			s += i; //s = s + i;
//			i++;
//		}
//		System.out.printf("전체 합 : %d\n", s);
		
		//철학 과목의 중간고사 점수의 전체 평균점수 구하기
		//점수 입력 받음 학생 총 인원수는 알수 없음
		//전체 합을 무한루프 안에서 구하고 음수를 이용해 반복문 빠져 나오기
		Scanner sc = new Scanner(System.in);
		
		int score;
		int stu = 0;
		int sum = 0;		
		
		while(true) {
			System.out.printf("%d번 학생 철학 중간고사 점수 입력(나가기(음수입력)) >> ", stu);		
			score = sc.nextInt();
						
			if (score < 0)
				break;
			
			sum += score;
			stu++;
		}
		
		double total = (double)sum/stu;
		System.out.printf("철학과목 전체 평균점수 : %.2f\n", total);
		
		
	}

}
