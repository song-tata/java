package stream.input;

import java.io.FileReader;

public class FileReaderTest2 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("새 텍스트 문서.txt");
			System.out.println((char)fr.read());
			System.out.println((char)fr.read());
			System.out.println((char)fr.read());
			System.out.println((char)fr.read());
			System.out.println((char)fr.read());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n푸로그램 종료");
	}

}
