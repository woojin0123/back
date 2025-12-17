package ch04_제어문;

public class Ex04_for문 {

	public static void main(String[] args) {
		/*
		 * for문
		 * 	for(초기식; 조건식; 증감식) {
		 * 		실행문;
		 * }
		 * 
		 * 실행 순서
		 * 	1. 초기식
		 * 	2. 조건식
		 * 	3. 실행문
		 * 	4. 증감식
		 * 	5. 조건문
		 * 	6. 실행문
		 * 	7. 증감식
		 * 	...
		 * 		 */
		
		// 1부터 10까지의 자연수
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 1부터 100까지의 합
		int sum = 0;
		int i;
			
		for(i=1; i<=100; i++) {
			sum += i;
		}
			
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		
		System.out.println("\n");
		// 부동 소수점
		// 0.1부터 1.0까지 10번 반복이 아닌 9번 반복함
		// > float 타입은 연산 과정에서 정확한 소수점을 표현하지 못함
		// > 증감식에서 x에 더해지는 실제값은 0.1보다 약간 클 수 있음
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
		System.out.println(x);
		}

	}
}
