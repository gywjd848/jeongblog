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
		System.out.printf("%5d\n", 123);   //%5d > 5만큼 할당(오른쪽 정렬 기준 빈 자리는 공백으로 처리),5자리에 넣은 숫자만큼 할당
		System.out.printf("%05d\n", 123);  //%05d > 5만큼 할당(오른쪽 정렬 기준 빈 자리는 0으로 처리)
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);

		System.out.printf("%s\n", "Hi~Java");
		System.out.printf("%10s\n", "Hi~Java");  //왼쪽기준으로 정렬은 숫자앞에 '-'붙이기
		
		System.out.printf("\n줄바꿈\n연습\n");
		System.out.printf("\t탭키\t연습\n");
		System.out.printf("글자가 \"강조\"되는 효과\n");  //따옴표 출력하고싶을때 \"~\"  ~자리에 강조하고싶은 글 적기
		System.out.printf("\\\\\\ 역슬래시 세개 출력 \n");
		
		
	}

}
