package ch06_클래스.ex06_가변길이매개변수;

public class ComputerMain {

	public static void main(String[] args) {
		Computer myComputer = new Computer();
		
		int result1 = myComputer.sum(1, 2, 3);
		
		 int result2 = myComputer.sum(1, 2, 3, 4, 5);
		
		// 맨 마지막에 출력문 몰아쓰려면 재선언 안하거나 결과값 다르게 설정
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		// 배열을 직접 매개값으로 지정
		int[] values = {10, 20, 30};
		int result3 = myComputer.sum(values);
		System.out.println("result3= " + result3);
		
		int result4 = myComputer.sum( new int[] {10, 20, 30, 40, 50});
		System.out.println("result4= " + result4);

	}

}