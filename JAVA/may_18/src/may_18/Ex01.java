package may_18;

import java.util.Scanner;
//입력받은 두 수의 합과 차를 구하여 출력
//두수의 차는 큰 수에서 작은수를 뺀것으로 한다
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		System.out.printf("두 수의 합 :%d\n" + (num1 + num2));
		
		if(num1 > num2)
			System.out.printf("두 수의 차 :%d\n" + (num1 - num2));				
		else
			System.out.printf("두 수의 차 :%d\n" + (num2 - num1));				
		
		
		
		
		
	}
	
}
