package ch08_인터페이스.ex08_인터페이스상속;

// 인터페이스C임프타입은 상속된 추상 메서드 InterFaceA.methodA()를 구현해햐 한다
// alt+shift+s, v: 추상메서드 재정의 대화상자

/**
 * 인터페이스 상속
 * 	- 자식 인터페이스의 구현 클래스는 자식 인터페이스의 추상 메서드 뿐만 아니라 모두 재정의 해야함
 */
public class InterfaceCImpl implements InterfaceC {
	
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");
	}

	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");
	}

	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");
	}
	
}