package ch08_인터페이스.ex03_추상메서드;

/**
 * 추상 메서드
 * 	- 중괄호{...}가 없는 메서드 
 * 
 * 		[public abstract] 리턴타입 메서드명(매개변수, ...);
 */
public interface RemoteControl {
	// 상수 필드
	// 최대 볼륨
	// 모두 대문자 + 스네이크 표기법
	int MAX_VOLUME = 10;
	// 최소 볼륨
	int MIN_VOLUME = 0;
	
	// 추상 메서드
	// 형식: [public abstract] 리턴타입 매서드명(매개변수, ...);
	// 전원 켜기
	// 리턴값이 없으면 타입: void
	void turnOn();
	// 볼륨 조절
	void setVolume(int volume);
	// 전원 끄기
	void turnOff();
}
