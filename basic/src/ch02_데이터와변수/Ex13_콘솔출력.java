package ch02_데이터와변수;

public class Ex13_콘솔출력 {

	public static void main(String[] args) {
		int value = 123;
		// 줄바꿈 된다
		System.out.println(value);
		// 줄바꿈 안된다
		System.out.print(value);
		
		// format 지정 출력
		// System.out.printf("형식문자", 출력값);
		System.out.printf("상품 가격: %d원\n", value);
		System.out.printf("상품 가격: %6d원\n", value);
		System.out.printf("상품 가격: %-6d원\n", value);
		System.out.printf("상품 가격: %06d원\n", value);

	}

}
