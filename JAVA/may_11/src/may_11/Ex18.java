package may_11;

public class Ex18 {
	public static void main(String[] args) {
		System.out.printf("100+100");
		System.out.printf("\n");
		System.out.printf("%d", 100 + 100);
		System.out.printf("\n");
		
		
		System.out.printf("%d %d", 100, 200);
		System.out.printf("\n");
		System.out.printf("%d", 100);
		System.out.printf("\n");
		
		
		System.out.printf("%d / %d = %.2f\n", 100,200,(double)100/200.0);
		System.out.printf("%s\t%s", "Hello", "Java\n");
		
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);   //%5d > 5��ŭ �Ҵ�(������ ���� ���� �� �ڸ��� �������� ó��),5�ڸ��� ���� ���ڸ�ŭ �Ҵ�
		System.out.printf("%05d\n", 123);  //%05d > 5��ŭ �Ҵ�(������ ���� ���� �� �ڸ��� 0���� ó��)
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);

		System.out.printf("%s\n", "Hi~Java");
		System.out.printf("%10s\n", "Hi~Java");  //���ʱ������� ������ ���ھտ� '-'���̱�
		
		System.out.printf("\n�ٹٲ�\n����\n");
		System.out.printf("\t��Ű\t����\n");
		System.out.printf("���ڰ� \"����\"�Ǵ� ȿ��\n");  //����ǥ ����ϰ������ \"~\"  ~�ڸ��� �����ϰ���� �� ����
		System.out.printf("\\\\\\ �������� ���� ��� \n");
		
		
	}

}
