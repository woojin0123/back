package ch06_클래스.ex03_필드초기화;

import javax.print.attribute.standard.Destination;

/**
 * 11.필드 초기화
 * 		타입 필드명 = 초깃값;
 * 
 *  - 객체마다 동일한 값을 갖고 있다면 필드 선언 시 초깃값을 대입하는 것이 좋고,
 *  - 객체마다 다른 값을 가져야 한다면 생성자에서 필드를 초기화하는 것이 좋다.
 * 
 * 생성자 선언 시 초기화
 * 		this.필드명 = 매개변수명
 * 
 *  - this는 현재 객체를 말하며, 매개변수명과 필드명을 구분하기 위해 사용한다.
 *  - this.name은 현재 객체의 데이터(필드)로서의 name을 뜻한다.
 *  
 * 24.final 필드와 상수
 * 	- 인스턴스 필드와 정적 필드는 언제든지 값을 변경할 수 있다.
 *  - final 필드는 초깃값이 저장되면 이것이 최종적인 값이 되어 프로그램 실행 도중에 수정할 수 없다.
 *  - final 필드의 초깃값은 필드 선언 시 또는 생성자 초깃값으로 지정할 수 있다.
 *  
 *  	final 타입 필드 [=초깃값];
 *  
 * 필드 유형
 * 	1. 인스턴스(instance) 필드: 앞에 아무것도 안붙이면, 값 수정 가능
 * 	2. 정적(static) 필드: 앞에 static, 값 수정 가능
 * 	3. 파이널(final) 필드 : 앞에 final, 값 수정 불가(최종값)
 */
public class Korean {
	// 1. 필드 선언 시 초기화
	// 타입 필드명 = 초기값;
	// 객체마다 동일한 값을 갖고있다면 필드 선언 시 초기값을 대입하는 게 좋고, 
	// 객체마다 다른 값을 가진다면 생성자에서 필드를 초기화하는 게 좋다
	// final 타입 필드 = 초기값; (초기값 생략 가능)
	final String nation = "대한민국";	
	String ssn;
	String name; 
	
	public Korean(String name, String ssn) {
		// this.nation = nation;
		// this.ssn = ssn;
		// final때문에 재할당 불가

		this.name = name;
		this.ssn = ssn;
		
	}
}
