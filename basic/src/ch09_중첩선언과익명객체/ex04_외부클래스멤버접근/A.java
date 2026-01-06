package ch09_중첩선언과익명객체.ex04_외부클래스멤버접근;

public class A {
	//A의 인스턴스 필드와 메소드
	int field1;
	void method1() { }

	//A의 정적 필드와 메소드
	static int field2;
	static void method2() { }

	//인스턴스 멤버 클래스
	class B {
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			field1 = 10;		//(o)
			method1();			//(o)		
			//A의 정적 필드와 메소드 사용
			field2 = 10;		//(o)
			method2();			//(o)
		}
	}

	//정적 멤버 클래스
	static class C {
		void method() {
			// Cannot make a static reference 
			// to the non-static field field1
			// Cannot make a static reference 
			// to the non-static method method1() from the type A
			//A의 인스턴스 필드와 메소드 사용
			//field1 = 10;		//(x)
			//method1();		//(x)
			//A의 정적 필드와 메소드 사용
			field2 = 10;		//(o)
			method2();			//(o)
		}
	}	
}