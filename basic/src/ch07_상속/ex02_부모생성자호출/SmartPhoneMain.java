package ch07_상속.ex02_부모생성자호출;

public class SmartPhoneMain {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone1 = new SmartPhone();
		SmartPhone myPhone2 = new SmartPhone("갤럭시", "은색");
			
		//Phone으로부터 상속 받은 필드 읽기
		System.out.println("모델: " + myPhone1.model);
		System.out.println("색상: " + myPhone1.color);
		System.out.println("모델: " + myPhone2.model);
		System.out.println("색상: " + myPhone2.color);
	}
}