package ch02_데이터와변수;

public class Ex04_long정수 {
	
	public static void main(String[] args) {
		// 찾기, 바꾸기: ctrl+f
		// alt+shift+a: 다중 편집 상태, shift+방향키로 선택 후 수정  
		long var1 = -128;
		long var2 = -30;
		long var3 = 0;
		long var4 = 30;
		long var5 = 127;
//		long var6 = 128; // 에러, long 범위를 벗어남
		
		// 출력
		System.out.println("var1: " + var1); // -128
		System.out.println("var2: " + var2); // -30
		System.out.println("var3: " + var3); // 127
		System.out.println("var4: " + var4); // 30
		System.out.println("var5: " + var5); // 127
	}
}
