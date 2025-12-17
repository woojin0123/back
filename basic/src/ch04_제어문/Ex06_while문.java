package ch04_제어문;

/**
 * for문 
 * 	- 정해진 횟수만큼 반복
 * while문
 * 	- 조건식이 true일 경우 계속 반복
 * 
 * 		while (조건식) {
 * 			실행문;
 * 		}
 * 
 */
public class Ex06_while문 {

	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		
		System.out.println("\n");
		
		// 1부터 100까지의 합
		int sum = 0;
		i = 1;

		while(i<=100) {
			sum += i;
			i++;
		}

		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}

}
