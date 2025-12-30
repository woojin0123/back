package ch08_인터페이스.ex03_추상메서드;

import ch08_인터페이스.ex04_디폴트메서드.RemoteControl;

/**
 * 구현 클래스
 * 	- 인터페이스의 추상메서드를 반드시 재정의 해야함
 *  	[접근제한자] class 클래스명 implements 인터페이스명 {...}
 */
public class Audio implements RemoteControl {
	// 필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 볼륨은 " + this.volume + "입니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
}
