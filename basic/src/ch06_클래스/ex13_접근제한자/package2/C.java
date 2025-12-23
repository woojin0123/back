package ch06_클래스.ex13_접근제한자.package2;

// 서로 다른 패키지는 import 필요
import ch06_클래스.ex13_접근제한자.package1.B;

public class C {
	// B는 public으로 접근 가능
	
	B b1 = new B(false); // public 생성자
	// B b2 = new B(10); // default 생성자, 에러 > default는 같은 패키지에서만 사용 가능
	// B b3 = new B("문자열"); // private 생성자, 에러
	
	public void method() {
		b.field1 = 1; // public 필드
//		b.field2 = 2; // default 필드, 에러
//		b.field3 = 3; // private 필드, 에러
//		
//		b.method1(); // public 메서드
//		b.method2(); // default 메서드, 에러
//		b.method3(); // private 메서드, 에러
	}
}
