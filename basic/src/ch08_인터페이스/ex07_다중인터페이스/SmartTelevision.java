package ch08_인터페이스.ex07_다중인터페이스;

/**
 * 클랴스의 다중 상속은 X
 * 		[접근제한자] class 클래스명 expends 클래스1, 클래스2, ... {...} < 안됨
 * 
 * 다중 인터페이스 O
 * 	- 둘 이사의 인터페이스를 가지고 클래스 구현 가능 
 * 
 * 		[접근제한자] class 클래스명 implements 인터페이스1, 인터페이스 2, ... {}
 */
public class SmartTelevision implements RemoteControl, Searchable {
	//turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
		
	//turnoff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//search() 추상 메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}		