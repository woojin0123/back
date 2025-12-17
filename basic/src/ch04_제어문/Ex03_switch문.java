package ch04_제어문;

/**
 * 조건문
 * 	1. if문
 * 		- 조건문의 결과가 true, false인 경우
 * 		- 경우의 수가 많으면 else if문을 계속 추가: 코드가 복잡해질수있음
 * 	2. switch문
 * 		- 변수의 값에 따라 실행문이 결정: if문보다 코드가 간결해짐
 * 
 * 		switch (변수) {
 * 			case 값1:
 * 				실행문1;
 * 				break;
 * 				실행문2;
 * 				break;
 * 				실행문3;
 * 				break;
 * 				...
 * 				default:
 * 				실행문n;
 * 			}
 */
public class Ex03_switch문 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
		}
		System.out.println("\n");
			// no break
			int time = (int)(Math.random()*4) + 8;  
			System.out.println("[현재시간: " + time + " 시]");
		
			switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
			System.out.println("\n");
			char grade = 'B';
			
			// 2개 이상의 case를 같은 실행문에 적용
			switch(grade) {
				case 'A':
				case 'a':
					System.out.println("우수 회원입니다.");
					break;
				case 'B':
				case 'b':
					System.out.println("일반 회원입니다.");
					break;							
				default:
					System.out.println("손님입니다.");
			}
			System.out.println("\n");
				grade = 'B';
				
				switch(grade) {
					case 'A', 'a' -> {
						System.out.println("우수 회원입니다.");
					}
					case 'B', 'b' -> {
						System.out.println("일반 회원입니다.");
					}						
					default -> {
						System.out.println("손님입니다.");
					}
				}
				System.out.println("\n");
				
				// 실행문이 하나면 중괄호 생략 가능
				switch(grade) {
					case 'A', 'a' -> System.out.println("우수 회원입니다.");
					case 'B', 'b' -> System.out.println("일반 회원입니다.");						
					default -> System.out.println("손님입니다.");
				}
				
				System.out.println("\n");
				//String grade = "B";
				
				//Java 11 이전 문법
				int score1 = 0;
				switch(grade) {
				    case 'A':
				    	score1 = 100;
				    	break;
				    case 'B':
				    	int result = 100 - 20;
				    	score1 = result;
				    	break;
				    default:
				    	score1 = 60;
				}
				System.out.println("score1: " + score1);
				System.out.println("\n");
				
				// Java 12부터 가능
				// switch 결과를 변수에 대입
				// switch expressions를 사용하면 switch된 값을 변수에 바로 대입 가능 (yield)
				// 단일값일 경우, 화살표 오른쪽에 값을 지정
				// 중괄호를 사용할 경우, yield 키워드로 값을 지정 *default 반드시 존재해야함
				int score2 = switch(grade) {
					case 'A' -> 100;
					case 'B' -> {
						int result = 100 - 20;
						//Java 13부터 가능
						yield result;
					}
					default -> 60;
				};
				System.out.println("score2: " + score2);
		}
	}

