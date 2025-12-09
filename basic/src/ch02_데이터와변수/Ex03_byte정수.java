package ch02_데이터와변수;

public class Ex03_byte정수 {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128; // 에러, byte 범위를 벗어남
		
		// 출력
		System.out.println("var1: " + var1); // -128
		System.out.println("var2: " + var2); // -30
		System.out.println("var3: " + var3); // 127
		System.out.println("var4: " + var4); // 30
		System.out.println("var5: " + var5); // 127
	}
}
