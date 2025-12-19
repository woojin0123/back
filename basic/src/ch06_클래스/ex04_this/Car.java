package ch06_클래스.ex04_this;

/**
 * 오버로딩: 이름은 같고 매개변수의 갯수, 타입, 순서가 다른 경우
 *	1. 생성자 오버로딩
 *	2. 메서드 오버로딩
 *	
 *	생성자 오버로딩(overloading)이 많은 경우 중복된 코드 발생
 * 	> 공통 코드를 가진 생성자 작성 후 다른 생성자는 this(...)를 사용하여 호출
 * 
 * this: 클래스(객체) 자기 자신
 * this(): 공통 코드를 가진 생성자 호출
 */
public class Car {
	String company = "hyundai";
	String model = "grandeur";
	String color = "black";
	int maxSpeed = 350;
	int speed;

	// alt+ shift + o: 생성자 클래스 만들기
	// 커서 위치의 한줄 코드 삭제: ctrl+d, vscode: ctrl+x
	// 생성자 오버로딩
	Car(String model) {
		this(model, "silver", 170); // < 필드로 접근한 게 아니라 값으로 접근한 거여서 가능
//		this(model, color, maxSpeed); < 안됨/만들지도 않았는데 필드에 접근 불가함
//		this.model = model;
	}

	Car(String model, String color) {
		this(model, color, 250);
//		this.model = model;
//		this.color = color;
	}

		// 공통 코드를 가진 생성자
	Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
