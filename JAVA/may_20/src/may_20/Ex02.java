package may_20;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Ex02 {
	public static void main(String[] args) {
		//���� ����Ͻðڽ��ϱ�? yes or no �ݺ���
		Scanner sc = new Scanner(System.in);
		
		char choose;
		int game;	
		
		
			System.out.println("[[���� ����]]");
			System.out.println("1. ����������");
			System.out.println("2. ��Ʈ����");
			System.out.println("\n���� ���� >> ");
			game = sc.nextInt();

			
			System.out.println("������ ��� �Ͻðڽ��ϱ�?(y/n)");
			sc.nextLine();
			choose = sc.nextLine().charAt(0);
						
			if(choose == 'n') {
				System.out.println("������ �����մϴ�.\n");
				break;
			}
				
			}
			
}
			
		



