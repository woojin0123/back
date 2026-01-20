package ch16_스트림.ex06_최종처리;

import java.util.Arrays;
import java.util.List;

public class 커스텀집계 {
	public static void main(String[] args) {
		List<Student2> studentList = Arrays.asList(
				new Student2("홍길동", 92),
				new Student2("신용권", 95),
				new Student2("감자바", 88)
		);		
		//방법1
		int sum1 = studentList.stream()
				.mapToInt(Student2 :: getScore)
				.sum();		
		//방법2
		// stream(): studentList 컬렉션을 데이터 흐름(stream)으로 변환
		// map(): 
		// 	- 각 student2 객체에서 getScore 메서드를 실행하여 점수(Integer/int)만 추출
		// 객체들의 흐름을 숫자의 흐름으로 변환
		// reduce(기본값, (accumulator, element)):
		// 	accumulator: 현재까지 합산된 결과(중간 결과)
		//	element: 스트림에서 새로 들어온 요소
		//	- 스트림의 요소들을 하나의 결과값으로 축소(결합)
		// 	- ((92, 95) -> 92+95) -> ((187, 88) -> 187+88 -> 275
		int sum2 = studentList.stream()
						.map(Student2 :: getScore)
						.reduce(0, (a, b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}
}