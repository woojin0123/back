package ch07_상속.ex03_메서드재정의;

public class SupersonicAirplaneMain {
	public static void main(String[] args) {
		Airplane ap = new Airplane();
		ap.fly(); // 자식 fly 호출, 자식이 재정의가 안되어있으면 부모 호풀
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff(); // 부모
		sa.fly(); // 부모: super.fly 때문에 부모 것이 호출됨
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // 자식
		sa.fly(); // 자식
		sa.flyMode = SupersonicAirplane.NORMAL; // 자식
		sa.fly(); // 부모
		sa.land(); // 부모
		
		// fly()는 재정의된 자식 fly()가 먼저 호출
		// 자식이 먼저 호출되지만 super 사용 시 부모 호출
	}
}