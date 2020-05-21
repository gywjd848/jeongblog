package may13;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	/*	int x = 20;
		int y = 50;
		int max;
		
		//조건식 ?true_value:False_value
		max = (x>y)? x: y;
		
		System.out.printf("최댓값:%d\n", max);
	*/
		int x,y,z;
		int max;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();		
		y = sc.nextInt();		
		z = sc.nextInt();	
		
		//max = x>y? x:y;
		//max = x>z? x:z;
		//max = y>z? y:z;
		//max = (x >= y && x >= z)? x: (y >= x && >= z)? y: z;
		
		max = x>y? x:y;
		max = max>z?max:z;
		
		System.out.printf("최댓값 : %d\n", max);
		
		
	}
		
		
	
}
