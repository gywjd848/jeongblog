package may13;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
//		//입력 받은 수가 짝수이면 "짝수", 홀수이면 "홀수" 라고 출력하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		
//		if(x % 2 == 0) {
//			System.out.println("짝수");
//		
//		System.out.printf("입력받은 수는 %d입니다.", x);
//		
//		}else {
//			System.out.println("홀수");
//			System.out.printf("입력받은 수는 %d입니다.", x);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		if(y == 0) {
//			System.out.println("입력 오류");
//			System.out.println("0은 분모 사용 불가");
//		}else {
//			int result = x / y;
//			System.out.printf("Result:%d\n", result);
//		}
	
		
		
		
		//당신의 국적은 (KOREA(1)/ETC(2))?
		//당신의 성별은 (MALE(3)/FEMALE(4))?
		//당신은 한국 여성입니다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int kor = 1;
//		int etc = 2;
//		int m = 3;
//		int fm = 4;
//		
//		
//		System.out.println("당신의 국적은 (KOREA(1)/ETC(2))?");
//		int nat = sc.nextInt();
//		System.out.println("당신의 성별은 (MALE(3)/FEMALE(4))?");
//		int gen = sc.nextInt();
//		
//		if(nat == kor) 
//			if(gen == m)
//				System.out.println("당신은 한국 남성입니다.");
//			else 
//				System.out.println("당신은 한국 여성입니다.");
//		else
//			if(gen == m)
//				System.out.println("당신은 외국 남성입니다.");
//			else
//				System.out.println("당신은 외국 여성입니다.");
		
		
		
			
		//if문을 이용해 입력받은 3개의 정수값의 최댓값 구하기
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫번째 정수를 입력하세요.");
//		int x = sc.nextInt();
//		System.out.println("두번째 정수를 입력하세요.");
//		int y = sc.nextInt();
//		System.out.println("세번째 정수를 입력하세요.");
//		int z = sc.nextInt();
//				
//		if(x>y)
//			if(x>z)
//				System.out.println("최댓값은 " + x + "입니다.");
//			else
//				System.out.println("최댓값은 " + z + "입니다.");
//		else
//			if(y>z)
//				System.out.println("최댓값은 " + y + "입니다.");
//			else
//				System.out.println("최댓값은 " + z + "입니다.");
			
		
		
		//입력받은 하나의 문자가 알파벳 대문자이면 1을 아니면 0을 출력하는 프로그램
		//(ch >= 65 && ch <= 90) or (ch >= 'A' && ch <= 'z')
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("문자를 입력하세요.");
//		char ch = sc.nextLine().charAt(0);
		
//		if (ch >= 65)
//			if (90 >= ch)
//				System.out.println("1");
//			else
//				System.out.println("0");
		
		
//		System.out.println("문자를 입력하세요.");
//		char ch = sc.nextLine().charAt(0);
//		System.out.println((ch >= 'A' && ch <= 'Z')? "1":"0");

		
		
		
		//키와 몸무게를 입력받아 정상인지 비반인지 출력하는 프로그램
		//키에 따른 표준 체중 구하는 방법 : 키에서 100을 빼고 그 값에 0.9를 곱한다.
		
//		System.out.println("키(신장)를 입력하세요.");
//		double height =sc.nextDouble();
//		System.out.println("몸무게를 입력하세요.");
//		double weight =sc.nextDouble();
//		
//		double stdw = (height - 100) * 0.9;
//		
//		if(stdw < weight)
//			System.out.println("과체중");
//		else if(weight >= stdw - 5 && weight <= stdw + 5)
//			System.out.println("표준");
//		else 
//			System.out.println("저체중");
		
//		System.out.println("키(신장)를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.println("몸무게를 입력하세요.");
//		int b = sc.nextInt();
//		
//		System.out.println(((a - 100) * 0.9) >= b? "정상":"비만");
//		
		
		
		
		//90이상 A 90~80 B 80~70 C 70~60 D 60이하 F
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("점수를 입력하세요.");
//		int score = sc.nextInt();
//		char grd;
//		
//		if(score >= 90)
//			grd = 'A';
//		else if(score >= 80)
//			grd = 'B';
//		else if(score >= 70)
//			grd = 'C';
//		else if(score >= 60)
//			grd = 'D';
//		else
//			grd = 'F';
//		
//		System.out.printf("학점은  %c입니다.\n", grd);
//		
//		
//		if(score >= 90) 
//			System.out.println(score + "점 입니다." + "등급은 A 입니다.");
//		else if(score >= 80) 
//			System.out.println(score + "점 입니다." + "등급은 B 입니다.");
//		else if(score >= 70) 
//			System.out.println(score + "점 입니다." + "등급은 C 입니다.");
//		else if(score >= 60) 
//			System.out.println(score + "점 입니다." + "등급은 D 입니다.");
//		else if(score < 60) 
//			System.out.println(score + "점 입니다." + "등급은 F 입니다.");
		
		//대문자, 소문자, 숫자, 나머지는 기타문자로 입력을 받는다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		char ch = sc.nextLine().charAt(0);
		
		if ('A' <= ch && 'Z'>= ch)
			System.out.println("대문자 입니다.");
		else if ('a' <= ch && 'z'>= ch)
			System.out.println("소문자 입니다.");
		else if ('0' <= ch && '9'>= ch)
			System.out.println("숫자 입니다.");
		else
			System.out.println("기타문자 입니다.");
		
		
	
		
		
	}

}
