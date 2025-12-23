package ch06_클래스.ex13_접근제한자.package1;

/**
 * 27.접근 제한자
 * 					제한 대상					제한 범위
 * 	1. public		필드, 생성자, 메서드, 클래스	없음
 *  2. protected	필드, 생성자, 메서드			같은 패키지, 자식 객체
 * 	3. default		필드, 생성자, 메서드, 클래스	같은 패키지
 *  4. private		필드, 생성자, 메서드			클래스(객체) 내부
 *  
 *  - 이클립스 클래스 생성 대화상자의 package = default
 *  - protected는 상속과 관련된 접근제한자
 *  
 *  지정하지 않으면 default
 *  
 *  클래스 접근 제한
 *  	[public] class 클래스명 {...}
 *  생성자 접근 제한
 *  	[public|private] 생성자명(...) {...}
 *  필드 접근 제한
 *  	[public|private] 타입 필드;
 *  메서드 접근 제한
 *  	[public|private] 리턴타입 메서드(...) {...}
 */

// A 클래스는 default 접근제한자(한정자)가 사용됨
// 별도로 지정하지 않으면 default
class A {
	// default 필드 선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// public 생성자
	public A(boolean b) {
		
	}
	
	// default 생성자
	A(int i) {
		
	}
	
	// private 생성자
	private A(String s) {
		
	}
	
	public void method() {
		A a1 = new A(true);
		A a2 = new A(1);
		A a3 = new A("문자열");

		B b1 = new B(false); // 같은 패키지의 public 클래스, public 생성자
		B b2 = new B(10);// default 생성자
		B b3 = new B("문자열"); // private 생성자, 에러
		// 같은 클래스의 생성자더라도 private는 자기만 사용 가능
	}
	
}
