package ch06_클래스.ex06_가변길이매개변수;

public class Computer {
	// 합계
	// 1부터 10까지의 합
	
	// for문 사용 시 중괄호 안에 작성 < class 안에서는 필드, 생성자, 메서드만 사용 가능
	
	// 가변길이 매개변수
	// 타입 메서드(타입 ... 매개변수)
	// values는 배열 타입 변수처럼 사용
	// int values = {값, 값, 값, ...}
	int sum(int ... values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
