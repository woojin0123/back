package ch05_참조타입;

/**
 * 문자열 메서드
 * 	1. 문자열.charAt(인덱스)					
 * 		: 지정한 위지(index)의 문자 하나를 반환
 * 	2. 문자열.length()						
 * 		: 길이(문자수) 반환
 * 	3. 문자열.replace(이전문자열, 대체문자열)		
 * 		: 이전문자열을 대체문자열로 치환하여 새로운 문자열 반환
 * 	4. 문자열.substring(시작인덱스, 끝인덱스) * 끝인덱스 생략 시 시작인덱스부터 문자열 끝까지 반환
 * 		: 시작인덱스부터 끝인덱스-1까지 문자열 반환
 * 	5. 문자열.indexOf(부분문자열)
 * 		: 문자열에서 부분문자열의 첫 index 번호를 반환
 * 	6. 문자열.contains(부분문자열)
 * 		: 문자열이 부분문자열을 포함하면 true, 아니면 false
 * 	7. 문자열.split()
 * 
 * 
 * 
 */	
public class Ex04_문자열메서드 {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		char gender = ssn.charAt(6);
		switch (gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
		
		System.out.println();
		
		ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		
		System.out.println();
		
		// 문자열.replace(이전문자열, 대체문자열)
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);
		
		System.out.println();
		
		// 문자열.substring(0,6): 인덱스 0~5 (끝 인덱스-1까지)
		// 문자열.substring(7): 7번째 문자 이후의 모든 문자 
		ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		System.out.println();
		
		String subject = "자바 프로그래밍";
		// 문자열 중 indexOf() 내 문자열 중 맨 앞 문자열의 인덱스 번호 반환  
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);

		System.out.println();
		
		// 자바의 인덱스 시작 번호는 0, if문은 true
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}

		System.out.println();
		
		// 자바라는 단어 포함돼있어서 true
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		System.out.println();
		
		// 문자열.split("구분자") * 구분자는 보통 쉼표로
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

		//문자열 분리(토큰) 쉼표로 구분해서 토큰 변수로 설정
		String[] tokens = board.split(",");
		// {"1", "자바 학습", "참조 타임 String을 학습한다.", "홍길동"}

		//인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println();
			
		//for 문을 이용한 읽기
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
