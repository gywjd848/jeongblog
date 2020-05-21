package may13;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//1부터 5까지의 정수에 대하여 제곱 값과 세제곱 값을 출력하는 프로그램을 작성
		//정수 값의 증가는 증감연산자를 활용
		
		/*
		int x = 1;
		
		System.out.printf("%10s%10s%10s\n", "int", "Square", "Cube");
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		x++;
		System.out.printf("%10d%10d%10d\n", x, x*x, x*x*x);
		*/
		
		//사용자로부터 물리, 역사, 철학 점수를 입력 받아 세 점수가 70점 이상이면 통과, 
		//그렇지 않으면 다음기회에 라는 문자열이 출력되는 프로그램을 작성(조건연산자를 이용)
		
		/*
		int a, b, c;
	
		Scanner s = new Scanner(System.in);
			
		System.out.println("물리 점수를 입력하세요.");
		a = s.nextInt();
		System.out.println("역사 점수를 입력하세요.");
		b = s.nextInt();
		System.out.println("철학 점수를 입력하세요.");
		c = s.nextInt();
		
		//boolean bool = (a>=70 && b>=70 && c>=70);
		//System.out.println(bool? "통과":"다음기회에");
		
		System.out.println((a>=70 && b>=70 && c>=70) ? "통과":"다음기회에");
		*/
		
		
		//세 자리로 이루어진 십진수 양의 정수 값을 입력 받은 후에 각각의 자릿수를 분리하고 이 자릿수를 출력하는 프로그램 작성
		//정수를 입력 : 378
		//백의 자리수 : 3
		//십의 자리수 : 7
		//일의 자리수 : 8
		
		int num;
		System.out.println("정수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//System.out.println("백의 자리수 : " + num / 100);
		//System.out.println("십의 자리수 : " + num %100/10);
		//System.out.println("일의 자리수 : " + num %10);
		
		System.out.println("백의 자리수 : " + num / 100);
		System.out.println("십의 자리수 : " + num / 10%10);
		System.out.println("일의 자리수 : " + num / 1%10);
		
		
	
		
	
	
		
		
	}

}
