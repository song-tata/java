package stream.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
//		FileInputStream fis = new FileInputStream("파일명.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			while ((i = isr.read()) != -1) { // 보조 스트림으로 읽어옴.
				if((char)i==' ') {
					
				}
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		// 응용 : main.txt -> 메인 음식 정보 ',' 배열에 넣는 행위도 가능
	}

}
