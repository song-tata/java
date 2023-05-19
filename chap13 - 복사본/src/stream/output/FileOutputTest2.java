package stream.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest2 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("output2.txt", true);

		try (fos) {
			byte[] bs = new byte[26];
			byte data = 65; // 'A' 의 아스키코드 값
			for (int i = 0; i < bs.length; i++) { // A-Z까지 배열에 넣기
				bs[i] = data++;
			}
			fos.write(bs);// 배열 한번에 쓰기
			fos.write(bs, 2, 10);// 배열의 2번째 위치부터 10개 바이트 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 버퍼에 저장된 데이터를 출력 대상에 즉시 쓰는 역할
		// 버퍼가 가득 차서 close()가 실행될때까지 기다림
		// 너무 많이 사용시 입출력 성능 저하 가능성 존재.
		fos.flush(); // 버퍼에 상관없이 바로 작성 -> 속도 빠름
		fos.close(); // 실행이 될 때 문서에 작성시작

		System.out.println("프로그램 종료");
	}

}
