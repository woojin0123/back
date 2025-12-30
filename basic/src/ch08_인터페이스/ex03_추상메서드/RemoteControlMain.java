package ch08_인터페이스.ex03_추상메서드;

public class RemoteControlMain {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		Television rc;
		
		// 객체 할당
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(25);
		rc.turnOff();
		
		Audio rc1;
		rc1 = new Audio();
		
		rc1.turnOn();
		rc1.setVolume(15);
		rc1.turnOff();

	}

}
