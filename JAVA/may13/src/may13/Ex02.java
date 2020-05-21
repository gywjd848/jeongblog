package may13;

import java.util.Scanner;

public class Ex02 {
	//4로 나누어 떨어지고 100으로 나누어 떨어지지않음
	//혹은 400으로 나누어 떨어지는 연도는 윤년이다.
	//입력받은 연도가 윤년이면 true 아니면 false
	
	public static void main(String[] args) {
	//	int x,y,z;
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("연도를 입력하세요.");
	//	int year = sc.nextInt();
		
	//	x = year/4;
	//	y = year/100;
	//	z = year/400;
		
	//  boolean bool;
	//	bool = year%x == 0 && year%y != 0 || year%z == 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();
		
		boolean bool = (year% 4 == 0) && (year% 100 != 0) || (year% 400 == 0);

		System.out.println("윤년 "+ bool);
		
	}
}
