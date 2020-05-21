package kr.ac.kopo.exapp;

import java.util.ArrayList;

public class ExList {
	
	//"1.목록 2.추가 3.삭제 4.종료" 라고 메뉴를 출력
	//번호를 입력받음
	//"1"을 입력한 경우, 현재까지 입력한 값들을 모두 출력
	//"2"를 입력한 경우, "좋아하는 음식을 입력하세요" 라고 출력하고
	//음식 이름을 입력 받아서 리스트에 저장
	//"3"번을 입력한 경우, "삭제할 음식의 번호를 입력하세요"라고 출력
	//입력한 번호의 음식을 리스트에서 삭제
	//"4"번을 입력한 경우, 프로그램을 종료
	//위 작업을 무한 반복

	public static void main(String[] args) {
		//리스트 생성
        //String을 여러개 저장할 수 있는 리스트(목록)를 생성
		//list라는 변수에 저장
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("피자"); //list라는 목록에 "피자"를 저장(추가)
		list.add("햄버거"); //list라는 목록에 "햄버거"를 저장(추가)
		
		System.out.println("리스트에 저장된 문자열 갯수 : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
