package stream;

import java.io.FileOutputStream;

public class FileOutput  {
	public static void main(String[] args) throws Exception{
		
		System.out.println("파일 출력");
		FileOutputStream fos = new FileOutputStream("output.txt");
		fos.write('b');
		fos.write('C');
		System.out.println("끝");
	}
}
