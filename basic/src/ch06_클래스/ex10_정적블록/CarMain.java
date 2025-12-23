package ch06_클래스.ex10_정적블록;

/**
 * 정적 메서드와 정적 블록에서 인스턴스 메서드 사용방법
 * 	- 객체를 생성 후 참조 변수로 접근
 */
public class CarMain {

	// 하나의 클래스 내에서 메서드로 바로 접근하는 거여서 myCar. 생략 가능
		// 인스턴스 필드
		int speed;
		// 인스턴스 메서드
		void run() {
			System.out.println(speed + "으로 달린다.");
		}
		
		// 정적 메서드
		static void simulate() {
			CarMain myCar = new CarMain();
			myCar.speed = 200;
			myCar.run();
	}
		// Main 메서드도 정적 메서드 > 인스턴스 메서드에 직접 접근 불가
		public static void main(String[] args) {
			
//			CarMain.simulate(); 
			simulate();
			
			CarMain myCar = new CarMain();
			myCar.speed = 60;
			myCar.run();
		}
}
