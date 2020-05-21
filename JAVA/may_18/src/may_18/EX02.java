package may_18;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		//근로 소득세를 계산하는 프로그램을 작성
		//1000만원 이하 세율 8%
		//1000만원 초과 4000만원 이하 세율 17%
		//4000만원 초과 8000만원 이하 세율 26%
		//8000만원 초과 세율 35%
		//사용자가 자신의 과세 표준 금액을 입력하면 근로 소득세를 계산하여 주는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과세 표준을 입력하세요.");
		int x = sc.nextInt();
				
		if(x <= 1000) {
			System.out.printf("소득세는 %0.f\n " + x * 0.08 +  "입니다.");
		}else if(x < 1000 && 4000 >= x) {
			System.out.printf("소득세는 %0.f\n " + x * 0.17 +  "입니다.");			
		}else if(x < 4000 && 8000 >= x) {
			System.out.printf("소득세는 %0.f\n" + x * 0.26  +  "입니다.");			
		}else if(x > 8000) {
			System.out.printf("소득세는 %0.f\n" + x * 0.35 +  "입니다.");			
		}
			
		
		
	}

}
