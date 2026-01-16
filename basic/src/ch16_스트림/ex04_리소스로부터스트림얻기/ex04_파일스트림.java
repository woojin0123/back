package ch16_스트림.ex04_리소스로부터스트림얻기;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * java.nio.file.Files
 * 	- line() 메서드: 텍스트 파일의 행 단위 스트림을 얻을 수 있다. 
 */
public class ex04_파일스트림 {
	public static void main(String[] args) throws Exception {
		// data.txt 파일의 경로(Path) 객체 얻기
		Path path = Paths.get(ex04_파일스트림.class.getResource("data.txt").toURI());
		// Path로부터 파일을 열고 한 행씩 읽으면서 문자열 스트림 생성, 기본 UTF-8 문자셋으로 읽음
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line) );
		stream.close();
	}
}