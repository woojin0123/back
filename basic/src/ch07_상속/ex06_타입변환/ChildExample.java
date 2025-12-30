package ch07_상속.ex06_타입변환;

/**
 * 부모타입에는 자식타입을 넣을 수 있지만 자식타입에는 부모타입을 넣을 수 없음
 * 
 * 클래스 타입 변환
 * 	1. 자동 타입 변환
 * 	- 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메서드만 접근 가능 
 * 	- 단, 자식 클래스에서 재정의된 메서드는 자식 메서드가 호출됨
 * 
 * 		부모타입 변수 = 자식타입객체;
 * 
 * 	2. 강제 타입 변환
 * 	- 자식 객체가 부모 타입으로 자동 변환된 후 다시 자식 타입으로 변환할 때 강제 타입 변환 사용 가능
 * 	
 * 		자식타입 변수 = (자식타입) 부모타입객체; 
 */
public class ChildExample {
	public static void main(String[] args) {
//		//자식 객체 생성
//		Child child = new Child();
//
//		//자동 타입 변환
//		Parent parent = child;
		
		// 객체 생성 및 자동 타입 변환, 위에 두개 같이 쓰면 같음
		Parent parent = new Child();
		parent.field1 = "data1";
//		parent.field2 = "data2"; // 에러, field2는 자식 필드

		//메소드 호출
		parent.method1();
		parent.method2();
		//parent.method3(); (호출 불가능: method3은 child 메서드)
		
		// 강제 타입 변환
		// 자식타입 변수 = (자식타입) 부모타입객체;
		Child child = (Child) parent;
		
		child.method2();
		child.method3();
	}
}