package ch05_참조타입;

public class Ex03_문자열 {

	public static void main(String[] args) {
		
		// 리터럴 방식
		// String 변수 = "문자열";
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		// 문자열1 == 문자열2
		// 문자열1 != 문자열2
		// 문자열 1&2 번지(주소) 비교
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		// 문자열1.equals(문자열2)
		// 문자열1&2 내용(값) 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
			
		// new 생성자
		// 	- 새로운 객체를 만드는 연산자(객체 생성 연산자)
		// 	- new 연산자로 객체를 생성하면 서로 다른 String 객체의 번지를 가짐
		// String 변수 - new String("문자열")
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		System.out.println();
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
	}

}
