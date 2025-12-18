package ch06_클래스.ex02_필드와생성자;

import org.w3c.dom.bootstrap.DOMImplementationRegistry;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car myCar2 = new Car("sonata");
		System.out.println("현재 모델은? " + myCar2.model);
	}

}
