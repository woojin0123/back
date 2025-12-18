package ch06_클래스.ex02_필드와생성자;

/**
 * 클래스 구성 요소
 * 	- 필드(변수): 속성(특징)
 * 	- 생성자
 * 	- 메서드
 * 
 * 
 * 07.필드 선언과 사용
 * 	1. 필드(Field)? 객체의 데이터를 저장하는 역할을 한다.
 *  2. 필드는 반드시 클래스 블록{} 안에서 선언되어야 한다.
 * 
 * 필드 선언
 * 		타입 필드명 [=초깃값];
 * 
 *  - 타입은 필드에 저장할 데이터의 종류를 결정한다.
 *  - 필드명은 카멜 표기법 (관례)
 * 
 * 09.생성자(Constructor)?
 * 	- new 연산자는 객체 생성 후 생성자를 호출해서 객체를 초기화한다.
 *  - 객체 초기화란 필드를 초기화하거나 메서드를 호출해서 객체 사용 준비를 하는 것을 말한다.
 *  - 클래스에 생성자 선언이 없으면 컴파일러는 기본 생성자(Default Constructor)를
 *    바이트코드 파일에 자동으로 추가시킨다.
 *  - 클래스가 public class로 선언되면 기본 생성자도 public이 붙고,
 *    클래스가 public 없이 선언되면 기본 생성자도 public이 붙지 않는다.
 *  - 명시적으로 선언한 생성자가 있다면, 컴파일러는 기본 생성자를 추가하지 않는다.
 *  - 생성자를 선언하는 이유? 객체를 다양하게 초기화하기 위해서
 *  - 생성자는 리턴 타입이 없고, 클래스 이름과 동일해야 한다.
 *  - 매개변수는 new 연산자로 생성자를 호출할 때 매개값을 생성자 블록 내부로 전달하는 역할을 한다.
 *
 * 10.생성자 선언
 *  1. 기본 생성자
 *  	[public] 클래스(){}
 *  2. 사용자 지정 생성자
 *  	클래스(매개변수, ...) { //객체 초기화 코드 }
 *
 * 12.생성자 오버로딩(Overloading)?
 *  - 매개변수의 타입, 개수, 순서를 다르게 여러 개의 생성자를 선언하는 것
 *  - 왜? 매개값으로 객체의 필드를 다양하게 초기화하기 위해서
 *
 */

public class Car {
	// 필드는 반드시 클래스 블록{} 안에서 선언되어야 한다.
	// 필드(변수) 선언 및 할당

	String company = "hyundai";
	String model = "grandeur";
	String color = "black";
	// 카멜표기법
	int maxSpeed = 350;
	// 선언
	int speed;
	
	Car(){
		
	}
	// 생성자
	// 생성자는 리턴 타입이 없고 클래스 이름이랑 동일해야함
	// [public] 클래스(){}
	// 클래스(매개변수, ...) { // 객체 초기화 코드}
	// 생성자를 선언하는 이유? 객체를 다양하게 초기화하기 위해서
	
	// this: 클래스 자기 자신
	Car(String model) {
		this.model = model;
	}
	Car(int maxSpeed) {
		
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
