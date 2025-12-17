package ch04_제어문;

import java.util.Scanner;

/**
 * for문과 while문은 조건이 false면 한번도 실행하지 않을 수 있음
 * do~while문은 조건이 false여도 최소 1번은 실행
 * 
 */
public class Ex08_dowhile문 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") );

		System.out.println();
		System.out.println("프로그램 종료");

	}

}
