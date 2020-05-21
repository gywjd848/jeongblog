package may_18;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int SCI = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		int pc = (int)(Math.random()*3)+1;
		
		System.out.println("가위바위보(1=가위, 2=바위, 3=보) >> ");
		int user = sc.nextInt();
		String result;
			
			if(user == SCI)
				if(pc == SCI)
					result = "draw";
				else if(pc == ROCK)
					result = "pc win";
				else
					result = "user win";
			else if(user == ROCK)
				if(pc == SCI)
					result = "user win";
				else if(pc == ROCK)
					result = "draw";
				else
					result = "pc win";
			else
				if(pc == SCI)
					result = "pc win";
				else if(pc == ROCK)
					result = "user win";
				else
					result = "draw";
			
			System.out.println("게임의 결과는 " + result + "입니다.");
			System.out.printf("컴퓨터는 %s 입니다.\n", pc == 1? "가위" : pc == 2? "바위":"보");

	}
}
