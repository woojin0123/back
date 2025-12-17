package ch03_연산자;

/**
 * 주석: alt+shift+j
 * 실행: ctrl+f11 (vscode= ctrl+f5) 
 */
public class Ex06_대입연산자 {

	public static void main(String[] args) {
		int result = 0;		
		result += 10;
		System.out.println("result=" + result);		
		result -= 5;
		System.out.println("result=" + result);		
		result *= 3;
		System.out.println("result=" + result);		
		result /= 5;
		System.out.println("result=" + result);		
		result %= 3;
		System.out.println("result=" + result);	

	}

}
