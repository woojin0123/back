package ch04_제어문;
/**
 * break문
 * 	- break를 만나면 제어문 종료
 * countinue문
 * 	- countinue 이후 문장은 실행하지 않고 for문은 증감식으로, while문은 조건식으로 이동하여 제어문 계속 실행
 */
public class Ex10_countinue문 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			// i는 1부터 10까지(10번 반복)
			if(i%2 != 0) {
				// i를 2로 나눴을 때 나머지가 0과 같지 않으면(홀수)
				continue;
				// System.out.print(i + " "); **에러 (countinue랑 같은 괄호안에 들어가면 안됨)
			}
			System.out.print(i + " ");
		}
	}
}
