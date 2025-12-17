package ch04_제어문;

/**
 * 제어문
 * 	1. 조건문
 * 	 	- if, if~else, if~else if
 * 		- switch
 * 	2. 반복문
 * 		- for
 * 		- while
 * 		- do~while
 * 	3. 기타
 * 		- break
 * 		- continue
 */
public class Ex01_if문 {

	public static void main(String[] args) {
		int score = 93;
			/*
			 * if 형식: 실행문이 하나면 중괄호 생략 가능
			 * 	if(score >= 90) {
			 * 		실행문;
			 *  }
			 *  
			 */
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90)
			System.out.println("점수가 90보다 작습니다.");
			// if문과 관련없는 문장 (중괄호가 없음)
			System.out.println("등급은 B입니다.");
			
			// 자동 정렬: ctrl+i (vscode: alt+shift+f)
			System.out.println("\n");
			/*
			 * if~else
			 * 	if (조건) {
					true 실행문;
			 * } else {
					flase 실행문;
			 * }
			 */
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
			}
		
		System.out.println("\n");
		score = 75;
		/*
		 * if~else if~else
		 * 	if (조건1) {
		 * 		조건1이 true일 때 실행문
		 * 	} else if (조건2) {
		 * 		조건1이 false면서
		 * 		조건2가 true일 때 실헹문
		 * 	} else if (조건3) {
		 * 		조건2가 false면서
		 * 		조건3이 true일 때 실행문
		 *  } [else {
		 *  	모든 조건이 다 false일 때 (생략 가능)
		 */
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
	}
		System.out.println("\n");
		
		// 자동형 변환(up casting): 큰변수 = 작은변수;
		// 강제 타입(형)변환(down casting): 작은변수 = 큰변수;
		System.out.println((int)Math.random()*20);
		// Math.random(): 0이상 1미만 사이의 임의 수(난수)
		
		// 0 <= Math.random() < 1
		// 0 <= Math.random() < 1*20
		// 0.xxx <= Math.random()*20 < 20.xxx
		// int(0.xxx) <= (int)Math.random()*20 < int(20.xxx)
		// 0 <= (int)Math.random()*20 < 20
		// 0 + 81 <= (int)Math.random()*20 + 81 < 20 + 81
		// 81 <= (int)Math.random()*20 < 101
		
		// 81이상 101미만의 정수
		score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		// if문 안에 if문(중첩if문)
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {	
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);

	} // public static void
} // Ex01_if문
