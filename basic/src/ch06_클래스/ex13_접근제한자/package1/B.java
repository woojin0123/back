package ch06_클래스.ex13_접근제한자.package1;

public class B {
	// default 필드 선언
	B b1 = new B(false);
	B b2 = new B(10);
	B b3 = new B("문자열");
	
	// public 필드
	public int field1;
	// default 필드
	int field2;
	// private 필드
	private int field3;
	
	
	// public 생성자
	public B(boolean b) {
		
	}
	
	// default 생성자
	B(int i) {
		
	}
	
	// private 생성자
	private B(String s) {
		field1 = 1;
		field2 = 2;
		field3 = 3;
		
		method1();
		method2();
		method3();
	}
	
	// public 메서드
	public void method1() {}
	// default 메서드
	void method2() {}
	// private 메서드
	private void method3() {}
	
	
	// A 클래스 접근 가능 (default고 같은 패키지에 있어서)
	A a;
	A a1;
	A a2;
	// 사용 불가: D클래스는 default 선언, 다른패키지에 있어서
//		C c;
//		D d;
	
}
