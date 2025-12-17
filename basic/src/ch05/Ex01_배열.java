package ch05;

/**
 * 데이터 타입
 * 	1. 기본 타입
 * 		- 정수 타입: byte, char, short, int, long
 * 		- 실수 타입: float, double
 * 		- 논리 타입: boolean
 * 	2. 참조(객체) 타입
 * 		- 배열(array) 타입 []
 * 		- 문자열 타입: String
 * 		- 열거(enum) 타입
 * 		- 클래스(class) 타입
 * 		- 인터페이스(interface) 타입
 * 
 * 기본 타입: 값 자체 저장
 * 	ex. int num = 3;
 * 참조 타입: 번지(주소) 저장 > 같은 데이터여도 new가 붙으면 {1, 2, 3}의 저장 위치가 다름
 * 	ex. int [] nums = new int[] {1, 2, 3}	
 * 
 * 참조 타입은 null값을 가질 수 있음: 참조하는 주소값이 있음
 * 
 */
public class Ex01_배열 {

	public static void main(String[] args) {
		// JS: 데이터 유형 상관없이 배열 사용 가능
		// 	 : [10, "문자", true]
		// 	 : 객체: {키: 값}
		
		// JAVA: 데이터 유형 상관있음
		//	   : {10, 20, 30}
		
		// int 타입 배열 선언
		// int[] 변수; or int 변수[];
		int[] arr1; //배열 변수 arr1 선언
		int[] arr3; //배열 변수 arr3 선언
		
		// 배열 할당: 리터럴 방식
		arr1 = new int[] { 1, 2, 3 };
		// 1: index[0]
		// 2: index[1]
		// 3: index[2]
		
		// 선언 및 할당
		int[] arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2;
			
		System.out.println(arr1 == arr2); // false, arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		System.out.println(arr2 == arr3); // true, arr2와 arr3 변수가 같은 배열을 참조하는지 검사
		
		System.out.println();
		// Exception(예외) - NullPointerException
		int[] intArray = null;
		//intArray[0] = 10; //NullPointerException

		String str = null;
		// length(): 문자열의 갯수 
		//System.out.println("총 문자 수: " + str.length() );//NullPointerException
	}

}
