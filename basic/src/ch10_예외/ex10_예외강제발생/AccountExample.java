package ch10_예외.ex10_예외강제발생;

/**
 * 사용자 정의 예외
 * 	- 일반 예외: Exception의 자식 클래스로 선언
 * 	- 실행 예외: RuntimeException의 자식 클래스로 선언
 * 		
 * 		public class XXXException extends [Exception | RuntimeException]
 * 			public XXXException(){} // 기본 생성자
 * 			public XXXException(String message){ // 예외
 * 				super()
 * 			} // 기본 생성자
 * 
 */
public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());

		//출금하기
		try {
			account.withdraw(30000);
		} catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}