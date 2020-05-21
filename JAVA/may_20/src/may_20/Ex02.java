package may_20;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Ex02 {
	public static void main(String[] args) {
		//게임 계속하시겠습니까? yes or no 반복문
		Scanner sc = new Scanner(System.in);
		
		char choose;
		int game;	
		
		
			System.out.println("[[게임 종류]]");
			System.out.println("1. 가위바위보");
			System.out.println("2. 테트리스");
			System.out.println("\n게임 선택 >> ");
			game = sc.nextInt();

			
			System.out.println("게임을 계속 하시겠습니까?(y/n)");
			sc.nextLine();
			choose = sc.nextLine().charAt(0);
						
			if(choose == 'n') {
				System.out.println("게임을 종료합니다.\n");
				break;
			}
				
			}
			
}
			
		



