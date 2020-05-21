package may_20;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//10개의 정수를 입력받아 최댓값과 최솟값 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int min = 0;
		int max = 0;
		
		System.out.printf("%d번째 숫자 입력 : ", 1);
		max = min = num = sc.nextInt();
		
		for(int i = 2; i <=10; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i);
			num = sc.nextInt();
			
			if (max < num)
				max = num;
			
			if (min > num)
				min = num;

//			min = num<min? num:min;
//			max = num>max? num:max;
		
		}
		
		System.out.printf("최솟값 : %d\n", min);
		System.out.printf("최댓값 : %d\n", max);
		
			
	}

}
