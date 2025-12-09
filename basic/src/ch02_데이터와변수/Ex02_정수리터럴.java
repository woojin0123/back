package ch02_데이터와변수;
/**
 * 
 * 
 * 정수의 타입
 * 1. byte 	1byte = 8bit, 2의 8승, 256개 숫자 > -128~127
 * 2. short	2byte = 16bit, 2의 16승, 65536개 숫자 > -32768~32767
 * 3. int 	4byte = 128bit, 2의 24승, 65536개 숫자 > -32768~32767
 * 4. long	8byte = 256bit, 2의 32승, 65536개 숫자 > -32768~32767
 * 5. char	2byte = 512bit, 2의 40승, 65536개 숫자 > -32768~32767
 */
// 다른 이름으로 저장 시 refactering 안됨 
public class Ex02_정수리터럴 {

	public static void main(String[] args) {
		// 리터럴(Literal): 프로그램 코드에서 직접 값으로 표현된 데이터, 변수에 지정되는 실제값

		int var1 = 0b1011; // 0b____, 2진수 1011 
		int var2 = 0206; // 0____, 8진수 206
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 0x____, 16진수
		
		// 출력
		System.out.println("var1: " + var1); // 11
		System.out.println("var2: " + var2); // 134
		System.out.println("var3: " + var3); // 365
		System.out.println("var4: " + var4); // 179
	}
}
