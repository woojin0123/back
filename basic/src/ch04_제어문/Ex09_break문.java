package ch04_제어문;

/**
 * break문
 * 	- 제어문(switch, for, while, do~while)을 탈출
 * 	- 제어문이 중첩되어 있을 경우 가장 가까운 제어문을 탈출
 */
public class Ex09_break문 {

	public static void main(String[] args) {
		
		int count = 0;
		while (count < 3) {
		while(true) {
			// 1부터 6사이의 정수
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
				// 한줄문장의 경우 중괄호 생략 가능
			}
			count++;
			System.out.println("count: " + count);
		}
		System.out.println("프로그램 종료");
		
		System.out.println();
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		
		System.out.println("프로그램 실행 종료");
	}

}
}