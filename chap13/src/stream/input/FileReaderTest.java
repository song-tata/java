package stream.input;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("새 텍스트 문서.txt")) {
			int i;
			//파일에 더이상 읽을 값이 없는 상태 : -1
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n푸로그램 종료");
	}

}
