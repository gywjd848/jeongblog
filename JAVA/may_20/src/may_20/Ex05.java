package may_20;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int j = 1; j <= num; j++) {
			for(int i = 1; i <= num; i++)
				if(i <= j) {
					System.out.printf("%d ", i);
				}
				
					System.out.println();
	}

}
}