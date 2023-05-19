package stream.reader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// 소요 시간 = 종료시간 - 시작시간
		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("새 텍스트 문서.zip");
				// 절대 경로, 상대 경로 - 웹프로그래밍
				FileOutputStream fos = new FileOutputStream("C:\\Users\\keduit\\Desktop\\새 폴더\\한글1.zip")) {
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			// while문 종료 시점의 시간
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 소요 시간: " + millisecond);
	}

}
