package ch01_시작하기;
/*package name: 
 * 1. 전체 소문자
 * 2. 공백, 특수문자 X, 
 * 3. 숫자로 시작 X
 * 4. 특수문자는 . or _
 * 5. 자바 키워드 사용 X
 * 6. .으로 계층 구조 폴더 
 * */
/**
 * 문서 주석(Javadoc)
 * @author 작성자 이름
 * 기능: Hello
 * 작성일: 2025-12-09
 */

/*
 * 접근제한자 class 클래스 명 {코드}
 * 1. 파스칼 표기법 - 단어별 첫 글자 대문자
 * 2. _ $ 숫자
 * 3. 예약어(키워드) 사용 X
 */
public class Ex01_Hello {
	/*
	 * 여러줄 주석: 영역 선택 후 ctrl+shift+/
	 */
	// 문자: char
	// 문자열: string
	// 정수: byte, short, int, long
	// 실수: float, double
	// 불: boolean
	// 접근제한자 static void main(데이터타입 인자)
	// - 프로그램의 시작점
	   public static void main(String[] args) {
	      // 주석, 행 바꾸기는 JAVASCRIPT랑 같음
		  // ctrl+N: 새문서
	      // ctrl+space: 자동 완성
	      // ctrl+f11: 실행
	      // ctrl+m: 편집창 크기 조절
		  // ctrl+d: 선택 행 삭제
	      // ctrl+-: 글씨 크기 조절
	      
	      // sysout 작성 후 ctrl+space
	      // ()안에 텍스트 입력 후 ctrl+f11
		   
		   //'문자: 문자 1자 > ex. 'A', 'a', '가' 
		   // * 문자 2자 이상이면 문자열임
		   // string "문자열"
		   // 객체.메서드(인자)
	      System.out.println("Hi, Java");
	   }

	}