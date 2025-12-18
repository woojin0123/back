package ch05_참조타입;

/**
 * 참조 타입은 null값을 가질 수 있음
 * 
 * null이란?
 * 	- 참조 타입 변수가 아직 번지를 저장하고 있지 않다는 뜻
 * 
 * Exception(예외)란?
 * 	- 변수가 null인 상태에서 객체의 데이터나 메서드를 사용하려 할 때 발생
 * 
 * JVM(JAVA VIRTUAL MACHINE) 이 쓰레기(garbage)를 자동으로 처리
 * Garvage Collection
 * 	- 유효하지 않은 객체를 식별하여 메모리 부족을 방지하고 효율적인 시스템을 구현
 */
public class Ex02_null {

	public static void main(String[] args) {

		// Exception(예외) - NullPointerException
		int[] intArray = null;
		//intArray[0] = 10; //NullPointerException

		String str = null;
		// length(): 문자열의 갯수 
		//System.out.println("총 문자 수: " + str.length() );//NullPointerException
		
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기(garbage)로 만듦

		String kind1 = "자동차";
		String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
		System.out.println("kind2: " + kind2);
	}

}
