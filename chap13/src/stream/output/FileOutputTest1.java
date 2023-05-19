package stream.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {
		//파일 입출력에서 파일이 생성 되었는가 파일을 찾지 못하였는가?
		//필수적으로 예외처리 필요
		try(FileOutputStream fos = new FileOutputStream("output.txt")) {
//			fos.write(65); //'A'
//			fos.write(66); //'B'
//			fos.write(67); //'C'
			for(int i = 0; i < 26;i++) {
				fos.write(65+i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
			
			
		}
		System.out.println("프로그램 종료");
	}

}
