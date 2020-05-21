package may_18;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요 >> ");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요 >> ");
		int month = sc.nextInt();
		int days;
		
		switch (month) {
		case 2: 
			if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
				days = 29; 
			else
				days = 28; break;
		case 4: case 6: case 9: case 11: days = 30; break;
		default: days = 31;
		}
		
		System.out.printf("입력한 %d년 %d월은 %d일까지 있습니다.\n", year, month, days);
//		
//		System.out.println("  [[menu]]  ");
//		System.out.println("1. 짬뽕 ");
//		System.out.println("2. 국밥");
//		System.out.println("3. 육회비빔밥");
//		System.out.println("4. 칼국수");
//		System.out.println("메뉴 선택 >> ");
//		
//		int menu = sc.nextInt();
//		
//		switch (menu) {
//		case 1: System.out.println("짬뽕 선택~~!"); break;
//		case 2: System.out.println("국밥 선택~~!"); break;
//		case 3: System.out.println("육회비빔밥 선택~~!"); break;
//		case 4: System.out.println("칼국수 선택~~!"); break;
//		default: System.out.println("존재하지 않는 항목입니다.");
		
		
//		}
	}
}
