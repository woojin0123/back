package ch08_인터페이스.ex02_상수필드;


/**
 * 상수 필드
 * 	- public static final 타입 상수명 = 값;
 * 		> public static final 생략 가능
 */
public interface RemoteControl {
	// 상수는 대문자+스네이크(전체대문자) 표기법
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
}