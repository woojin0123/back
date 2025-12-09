package ch01_시작하기;

public class Ex02_실행문 {
	// 클래스 생성 후 main 작성 > ctrl+space
	
	// 프로그램의 시작점
	// 컴파일 에러 + 실행 에러
	public static void main(String[] args) {
		
		// 실행문(Statement): 끝에는 무조건 ; 붙이기
		// 정수(Integer): byte, short, char, int, long
		int x, z; // 변수 선언
		x = 1; // 변수에 값을 할당
		z = 3;
		int y = 2; // 변수 선언 및 할당
		int result = x + y + z;
		
		System.out.println(result);
	}
}
