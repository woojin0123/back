package ch07_상속.ex02_부모생성자호출;

public class Phone {
	//필드 선언
	public String model;
	public String color;

	//기본 생성자 선언
	public Phone() {
		System.out.println("Phone 기본 생성자 실행");
	}

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
}
