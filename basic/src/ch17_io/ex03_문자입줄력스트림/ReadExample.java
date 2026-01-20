package ch17_io.ex03_문자입줄력스트림;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 문자 읽기
 *  - Reader는 문자 입력 스트림의 최상위 클래스로 추상 클래스이다.
 *  	- FileReader
 *  	- BufferedReader
 *  	- InputStreamReader
 *  
 *   1. int read(): 1개의 문자를 읽고 리턴
 *   2. int read(char[] cbuf)
 *   	: 읽은 문자들을 매개값으로 주어진 문자 배열에 저장하고 읽은 문자 수를 리턴
 *   3. void close(): 입력 스트림을 닫고, 사용 메모리 해제
 *   
 */
public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader reader = null;

			//1 문자씩 읽기
			// 텍스트 파일로부터 문자 입력 스트림 생성
			reader = new FileReader("C:/Users/두드림/wj/git/back/basic/src/ch17_입출력/temp/test.txt");
			while(true) {
				// 1 문자를 읽음
				int data = reader.read();
				// 파일을 다 읽으면 while 문 종료
				if(data == -1) break;
				// 읽은 문자 출력
				System.out.print((char)data);
			}
			reader.close();
			System.out.println();

			// 문자 배열로 읽기
			// 텍스트 파일로부터 문자 입력 스트림 생성
			reader = new FileReader("C:/Users/두드림/wj/git/back/basic/src/ch17_입출력/temp/test.txt");
			// 읽은 문자를 저장할 배열 생성
			char[] data = new char[100];
			while(true) {
				// 읽은 문자는 배열에 저장, 읽은 문자 수는 리턴
				int num = reader.read(data);
				// 파일을 다 읽으면 while 문 종료
				if(num == -1) break;
				// 읽은 문자 수만큼 출력
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}