package ch04_제어문;

// java.lang 패키지(기본 패키지)는 import 필요 없음
import java.util.Scanner;
// java.util 패키지의 Scanner class를 사용하기 위해 import 사용

public class Ex07_while응용 {

	public static void main(String[] args) {
		// 참조 타입: string, class, ...
		// new keyword로 생성한 객체(객체의 사본): instance
		// Scanner() 생성자 함수를 통해 sc 객체(instance)생성
		Scanner sc = new Scanner(System.in);
		// 기본 타입
		boolean run = true;
		int speed = 0;

		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------------------");
			System.out.print("선택: ");
			
			// nextLine(): 한줄 전체 입력
			String strNum = sc.nextLine();

			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");

	}

}
