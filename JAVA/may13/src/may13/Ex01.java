package may13;

public class Ex01 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		boolean bool;
		
		bool = x > y;
		System.out.println("��� : "+ bool);

		bool = x < y;
		System.out.println("��� : "+ bool);
		
		bool = x >= y;
		System.out.println("��� : "+ bool);
		
		bool = x <= y;
		System.out.println("��� : "+ bool);
		
		bool = x == y;
		System.out.println("��� : "+ bool);
		
		bool = x != y;
		System.out.println("��� : "+ bool);
		
		System.out.println("��� : "+ !bool);
	}

}
